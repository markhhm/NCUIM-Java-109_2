//<蘇湘婷--
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Detail extends JFrame {

    static JFrame frame;

    public static void Detail() {
        // 建立Frame
        frame = new JFrame("訂單明細");
        Container contentPane = frame.getContentPane();
        // 設定Frame的大小
        frame.setSize(800, 700);
        // 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
        frame.setLocationRelativeTo(null);
        // 設定容器不使用佈局管理員
        contentPane.setLayout(null);

        // 設定最上面的panel
        // 建立panel
        JPanel TopPanel = new JPanel();

        // 設定容器不使用佈局管理員
        TopPanel.setLayout(null);

        //判斷用餐方式
        String eating;
        if(ShoppingCart.forHere.isSelected()){
            eating = "For-Here " + OrderData.forhereCount;
        }else{
            eating = "To-Go " + OrderData.togoCount;
        }
        // 建立文字Label
        JLabel OrderNumberLab = new JLabel("訂單編號: " +  eating);

        // 設定位置大小
        OrderNumberLab.setBounds(0, 0, 1080, 50);

        // 改字的大小
        OrderNumberLab.setFont(OrderNumberLab.getFont().deriveFont(26.0f));

        // 把元件加到TopPanel裡
        TopPanel.add(OrderNumberLab);

        // 設定可滾動表格
        JTable table = new JTable(ShoppingCart.model1);
        JScrollPane jscrollpane = new JScrollPane(table);

        // 加入第二個表格
        JTable table2 = new JTable(ShoppingCart.model2);
        JScrollPane jscrollpane2 = new JScrollPane(table2);

        // 設定最下面的panel
        // 建立panel
        JPanel BottomPanel = new JPanel();

        // 設定容器不使用佈局管理員
        BottomPanel.setLayout(null);

        //判斷付款方式
        String PayWay;
        if(ShoppingCart.CreditCard.isSelected()){
            PayWay = "信用卡";
        }
        else{
            PayWay = "現金";
        }
//--蘇湘婷>

//<洪祥銘--
        String RemarksData;
        RemarksData = Objects.requireNonNull(OrderData.RemarksContent, "無備註");
        String CouponData;
        CouponData = Objects.requireNonNull(OrderData.CouponCode, "未使用優惠代碼");

        // 建立文字Label
        JLabel total = new JLabel(ShoppingCart.TotalContent); //共用shoppingcart的總價格內容
//--洪祥銘>

//<蘇湘婷--

        JLabel RemarksLab = new JLabel("備註: " + RemarksData);
        JLabel DiscountLab = new JLabel("優惠代碼: " + CouponData);
        JLabel PayWayLab = new JLabel("付款方式: " + PayWay);
        JLabel Thanks = new JLabel("謝謝光臨，祝您用餐愉快！");

        // 設定元件位置.大小
        total.setBounds(0, 0, 200, 50);
        RemarksLab.setBounds(0, 50, 900, 50);
        DiscountLab.setBounds(0, 100, 900, 50);
        PayWayLab.setBounds(0, 150, 900, 50);
        Thanks.setBounds(0, 200, 950, 100);

        // 改字的大小
        total.setFont(total.getFont().deriveFont(20.0f));
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(20.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(20.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(20.0f));
        Thanks.setFont(Thanks.getFont().deriveFont(40.0f));

        // 把元件加到BottomPanel裡
        BottomPanel.add(total);
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Thanks);

        // 設定三個panel的位置.大小
        TopPanel.setBounds(40, 0, 700, 80);
        jscrollpane.setBounds(40, 80, 700, 100);
        jscrollpane2.setBounds(40, 200, 700, 100);
        BottomPanel.setBounds(40, 320, 700, 450);

        // 加入panel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //關掉視窗
        OrderData.Reset();
    }
}
//--蘇湘婷>