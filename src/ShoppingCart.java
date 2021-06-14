import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingCart extends JFrame {

    static JButton ViewMenu;
    static JFrame frame;
    // 建立按鈕組
    static JRadioButton Cash;
    static JRadioButton CreditCard;

    public static void ShoppingCartFrame() {
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

        // 建立文字Label
        JLabel OrderNumberLab = new JLabel("訂單編號: " + "訂單編號數字轉成字串");

        // 建立按鈕
        ViewMenu = new JButton("返回菜單");

        // 設定位置大小
        OrderNumberLab.setBounds(0, 0, 1080, 50);
        ViewMenu.setBounds(1120, 0, 200, 50);

        // 改字的大小
        OrderNumberLab.setFont(OrderNumberLab.getFont().deriveFont(26.0f));
        ViewMenu.setFont(ViewMenu.getFont().deriveFont(20.0f));

        // 把元件加到TopPanel裡
        TopPanel.add(OrderNumberLab);
        TopPanel.add(ViewMenu);

        // 設定可滾動表格
        String[][] data = { { "編號一", "資料一", "4" }, { "編號二", "資料二", "4" }, { "編號三", "資料三", "4" } };
        String[] dataTitle = { "餐點", "數量", "價錢" };

        MyTableModel model = new MyTableModel(data, dataTitle);
        JTable table = new JTable(model);

        JScrollPane jscrollpane = new JScrollPane(table);

        // 加入第二個表格
        String[][] data2 = { { "編號一", "資料一", "資料一", "4", "資料一", "4" }, { "編號二", "資料二", "資料一", "4", "資料二", "4" },
                { "編號三", "資料三", "資料一", "4", "資料三", "4" } };
        String[] dataTitle2 = { "主餐", "附餐1", "附餐2", "飲料", "數量", "價錢" };

        MyTableModel model2 = new MyTableModel(data2, dataTitle2);
        JTable table2 = new JTable(model2);

        JScrollPane jscrollpane2 = new JScrollPane(table2);

        // 設定最下面的panel
        // 建立panel
        JPanel BottomPanel = new JPanel();
        // 設定容器不使用佈局管理員
        BottomPanel.setLayout(null);

        // 建立文字Label
        JLabel RemarksLab = new JLabel("備註");
        JLabel DiscountLab = new JLabel("優惠代碼");
        JLabel PayWayLab = new JLabel("付款方式");

        // 建立輸入框
        JTextArea Remarks = new JTextArea();
        LineBorder tt = new LineBorder(Color.GRAY);
        Remarks.setBorder(tt);
        JTextField Discount = new JTextField();
        JTextField CreditCardNumber = new JTextField();

        // 建立按鈕
        JButton Verification = new JButton("驗證");
        JButton CancelOrder = new JButton("取消訂單");
        JButton Checkout = new JButton("確認結帳");

        Cash = new JRadioButton("現金",false);
        CreditCard = new JRadioButton("信用卡",false);
    
        // 建立一個ButtonGroup物件
        ButtonGroup bg = new ButtonGroup();

        
        bg.add(Cash);
        bg.add(CreditCard);

        
        // 設定元件位置.大小
        RemarksLab.setBounds(0, 0, 200, 100);
        DiscountLab.setBounds(0, 100, 200, 100);
        PayWayLab.setBounds(0, 170, 200, 100);
        Remarks.setBounds(120, 0, 1200, 100);
        Discount.setBounds(120, 120, 1080, 50);
        Verification.setBounds(1220, 120, 100, 50);
        Cash.setBounds(120, 190, 100, 50);
        CreditCard.setBounds(340, 190, 100, 50);
        CreditCardNumber.setBounds(450, 190, 800, 50);
        CancelOrder.setBounds(1000, 270, 150, 80);
        Checkout.setBounds(1170, 270, 150, 80);

        // 改字的大小
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
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Remarks);
        BottomPanel.add(Discount);
        BottomPanel.add(Verification);
        BottomPanel.add(Cash);
        BottomPanel.add(CreditCard);
        BottomPanel.add(CreditCardNumber);
        BottomPanel.add(CancelOrder);
        BottomPanel.add(Checkout);

        // 加入觸發物件
        Checkout.addActionListener(new DetailListener());
        ViewMenu.addActionListener(new ViewMenuListener());

        // 設定三個panel的位置.大小
        TopPanel.setBounds(40, 20, 1320, 100);
        jscrollpane.setBounds(40, 120, 1320, 150);
        jscrollpane2.setBounds(40, 270, 1320, 150);
        BottomPanel.setBounds(40, 460, 1320, 350);

        // 加入panel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        
    }
}
