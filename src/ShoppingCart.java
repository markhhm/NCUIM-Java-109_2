//<蘇湘婷--
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ShoppingCart extends JFrame {
    static JButton ViewMenu;
    static JFrame frame;
    static JTextField Discount;
    static JTextArea Remarks;
    // 建立按鈕組
    static JRadioButton Cash;
    static JRadioButton CreditCard;
    static JRadioButton forHere;
    static JRadioButton toGo;
//--蘇湘婷>

//<洪祥銘--
    static DefaultTableModel model1;
    static DefaultTableModel model2;
    static String TotalContent = "";//用來存顯示總金額的label
    static JLabel total;
    static ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    static ArrayList<setType> Set_Menu = new ArrayList<setType>();
//--洪祥銘>

//<蘇湘婷--
    public static void ShoppingCartFrame() {
        new MenuData(Single_Menu, Set_Menu);//new兩個已經轉好資料型態的arraylist以供資料取用
        // 建立Frame
        frame = new JFrame("購物車");
        Container contentPane = frame.getContentPane();
        // 設定Frame的大小
        frame.setSize(1400, 900);
        // 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
        frame.setLocationRelativeTo(null);
        // 設定容器不使用佈局管理員
        contentPane.setLayout(null);

        // 設定最上面的panel
        // 建立panel
        JPanel TopPanel = new JPanel();

        // 設定容器不使用佈局管理員
        TopPanel.setLayout(null);

        // 建立按鈕
        ViewMenu = new JButton("返回菜單");
        forHere = new JRadioButton("內用",false);
        toGo = new JRadioButton("外帶",true);

        // 建立一個ButtonGroup物件
        ButtonGroup eating = new ButtonGroup();
        eating.add(forHere);
        eating.add(toGo);

        // 設定位置大小
        forHere.setBounds(0, 10, 100, 50);
        toGo.setBounds(120, 10, 100, 50);
        ViewMenu.setBounds(1120, 0, 200, 50);

        // 改字的大小
        forHere.setFont(forHere.getFont().deriveFont(26.0f));
        toGo.setFont(toGo.getFont().deriveFont(26.0f));
        ViewMenu.setFont(ViewMenu.getFont().deriveFont(20.0f));

        // 把元件加到TopPanel裡
        TopPanel.add(forHere);
        TopPanel.add(toGo);
        TopPanel.add(ViewMenu);

        // 設定可滾動表格
//<洪祥銘--
        model1 = new MyTableModel(); //繼承defaulttablemodel透過改寫讓tablemodel不可以輸入，詳見MyTableModel.java
        model1.addColumn("餐點");//新增表頭
        model1.addColumn("數量");
        model1.addColumn("價錢");
        AssignSingleOrderData(model1);//把宣告好的model丟入自訂的assigndata內，產生表格
        JTable table = new JTable(model1);//將準備好的model帶入JTable產生表格，以下同理

        JScrollPane jscrollpane = new JScrollPane(table);

        // 加入第二個表格
        model2 = new MyTableModel();
        model2.addColumn("主餐");
        model2.addColumn("副餐1");
        model2.addColumn("副餐2");
        model2.addColumn("飲料");
        model2.addColumn("數量");
        model2.addColumn("價錢");
        AssignSetOrderData(model2);
        JTable table2 = new JTable(model2);

        JScrollPane jscrollpane2 = new JScrollPane(table2);
//--洪祥銘>
        
        // 設定最下面的panel
        // 建立panel
        JPanel BottomPanel = new JPanel();
        // 設定容器不使用佈局管理員
        BottomPanel.setLayout(null);
        // 建立文字Label
        JLabel RemarksLab = new JLabel("備註");
        JLabel DiscountLab = new JLabel("優惠代碼");
        JLabel PayWayLab = new JLabel("付款方式");
//--蘇湘婷>

//<洪祥銘--
        if(OrderData.CouponCode.equals("")){ //第一次檢視購物車時預設顯示的總金額（尚未使用折扣碼）
            TotalContent = "總金額 "+OrderData.calculateTotal()+" 元";
        }
        total = new JLabel(TotalContent);
//--洪祥銘>

//<蘇湘婷--
        // 建立輸入框
        Remarks = new JTextArea();
        LineBorder tt = new LineBorder(Color.GRAY);
        Remarks.setBorder(tt);
        Discount = new JTextField();
        JTextField CreditCardNumber = new JTextField();

        // 建立按鈕
        JButton Verification = new JButton("驗證");
        JButton CancelOrder = new JButton("取消訂單");
        JButton Checkout = new JButton("確認結帳");

        Cash = new JRadioButton("現金",true);
        CreditCard = new JRadioButton("信用卡",false);
        // 建立一個ButtonGroup物件
        ButtonGroup bg = new ButtonGroup();
        bg.add(Cash);
        bg.add(CreditCard);

        
        // 設定元件位置.大小
        total.setBounds(1100, 20, 250, 70);
        RemarksLab.setBounds(0, 180, 200, 100);//NOTE: y 100->200
        DiscountLab.setBounds(0, 100, 200, 100);//NOTE: y 200-> 100
        PayWayLab.setBounds(0, 270, 200, 100);
        Remarks.setBounds(120, 190, 1200, 80);//NOTE: y 100 -> 220
        Discount.setBounds(120, 120, 1080, 50);//NOTE: y 220 -> 100
        Verification.setBounds(1220, 120, 100, 50);
        Cash.setBounds(120, 290, 100, 50);
        CreditCard.setBounds(340, 290, 100, 50);
        CreditCardNumber.setBounds(450, 290, 800, 50);
        CancelOrder.setBounds(1000, 370, 150, 80);
        Checkout.setBounds(1170, 370, 150, 80);

        // 改字的大小
        total.setFont(total.getFont().deriveFont(26.0f));
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(16.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(16.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(16.0f));
        Cash.setFont(Cash.getFont().deriveFont(16.0f));
        CreditCard.setFont(CreditCard.getFont().deriveFont(16.0f));
        Verification.setFont(Verification.getFont().deriveFont(16.0f));
        CancelOrder.setFont(CancelOrder.getFont().deriveFont(20.0f));
        Checkout.setFont(Checkout.getFont().deriveFont(20.0f));

        // 把元件加到BottomPanel裡
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(total);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Discount);
        BottomPanel.add(Remarks);
        BottomPanel.add(Verification);
        BottomPanel.add(Cash);
        BottomPanel.add(CreditCard);
        BottomPanel.add(CreditCardNumber);
        BottomPanel.add(CancelOrder);
        BottomPanel.add(Checkout);

        // 加入觸發物件
        CancelOrder.addActionListener(new CancelListener());
        Checkout.addActionListener(new DetailListener());
        ViewMenu.addActionListener(new ViewMenuListener());
        Verification.addActionListener(new VerificationListener());

        // 設定三個panel的位置.大小
        TopPanel.setBounds(40, 20, 1320, 100);
        jscrollpane.setBounds(40, 120, 1320, 120);
        jscrollpane2.setBounds(40, 250, 1320, 120);
        BottomPanel.setBounds(40, 360, 1320, 550);

        // 加入panel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        
    }
//--蘇湘婷>
//<洪祥銘--
    public static void AssignSingleOrderData(DefaultTableModel model) {
        for (int i = 0; i < 10 ; i++) {//透過for迴圈依序讀取點單暫存區
            if (OrderData.Singlecount[i] > 0) {//判斷是否有點該餐點
                String[] temp1 = {(Single_Menu.get(i).getName()),(OrderData.Singlecount[i]+""),((Single_Menu.get(i).getPrice() * OrderData.Singlecount[i])+"")};//將該餐點資料存入暫存的string陣列
                model.addRow(temp1);//把暫存string陣列存入model
            }
        }
    }
    public static void AssignSetOrderData(DefaultTableModel model) {//與以上同理，差別在於將三套餐的主餐分類，分別存入model，會寫這麼醜是因為當初要debug不然本來很精簡，但我懶了qq
        for (int i = 0; i < 3 ; i++) { //麥香雞
            String MainMealName = null;
            int price = 0;
            if (OrderData.Setcount[i] > 0){
                MainMealName = Single_Menu.get(1).getName(); //把尚未存入的主餐名字存入
                price = Single_Menu.get(1).getPrice(); // 主餐價格
            }
            if(MainMealName != null) { //透過主餐名字是否存在來判定該餐點是否有被選取，我知道寫得很醜，當時在抓bug麻qq
                String[] temp2 = {MainMealName+" "+ Set_Menu.get(i).getName(), (Set_Menu.get(i).getDish1().getName()), (Set_Menu.get(i).getDish2().getName()), (Set_Menu.get(i).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp2);//與上方同理，有加 "" 的原因是要轉成string
            }
        }
        for (int i = 3; i < 6; i++){ //滿福堡
            String MainMealName = null;
            int price = 0;
            if (OrderData.Setcount[i] > 0){
                MainMealName = Single_Menu.get(6).getName();
                price = Single_Menu.get(6).getPrice();
            }
            if(MainMealName != null) {
                String[] temp2 = {MainMealName+" "+ Set_Menu.get(i-3).getName(), (Set_Menu.get(i-3).getDish1().getName()), (Set_Menu.get(i-3).getDish2().getName()), (Set_Menu.get(i-3).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i-3).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp2);
            }
        }
        for (int i = 6; i < 9; i++){ //大麥克
            String MainMealName = null;
            int price = 0;
            if (OrderData.Setcount[i] > 0){
                MainMealName = Single_Menu.get(8).getName();
                price = Single_Menu.get(8).getPrice();
            }
            if(MainMealName != null) {
                String[] temp2 = {MainMealName+" "+ Set_Menu.get(i-6).getName(), (Set_Menu.get(i-6).getDish1().getName()), (Set_Menu.get(i-6).getDish2().getName()), (Set_Menu.get(i-6).getDrink().getName()), (OrderData.Setcount[i]+""), ((Set_Menu.get(i-6).getPrice() + price) * OrderData.Setcount[i]) + ""};
                model.addRow(temp2);
            }
        }
    }
    public static void CouponSingle(String[] CouponMeal){ //優惠碼兌換餐 單點
        model1.addRow(CouponMeal); //把優惠餐加入tablemodel
    }
    public static void CouponSet(String[] CouponMeal) { //套餐
        model2.addRow(CouponMeal); //同理
    }
//--洪祥銘>
}
