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

        // 建立文字Label
        JLabel OrderNumberLab = new JLabel("訂單編號: " + "訂單編號數字轉成字串");

        // 設定位置大小
        OrderNumberLab.setBounds(0, 0, 1080, 50);

        // 改字的大小
        OrderNumberLab.setFont(OrderNumberLab.getFont().deriveFont(26.0f));

        // 把元件加到TopPanel裡
        TopPanel.add(OrderNumberLab);

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

        //判斷付款方式
        String PayWay;
        if(ShoppingCart.CreditCard.isSelected()){
            PayWay = "信用卡";
        }
        else{
            PayWay = "現金";
        }

        // 建立文字Label
        JLabel RemarksLab = new JLabel("備註: " + "String");
        JLabel DiscountLab = new JLabel("優惠代碼: " + "String");
        JLabel PayWayLab = new JLabel("付款方式: " + PayWay);
        JLabel Thanks = new JLabel("謝謝光臨，祝您用餐愉快！");

        // 設定元件位置.大小
        RemarksLab.setBounds(0, 0, 900, 50);
        DiscountLab.setBounds(0, 50, 900, 50);
        PayWayLab.setBounds(0, 100, 900, 50);
        Thanks.setBounds(0, 150, 900, 100);

        // 改字的大小
        RemarksLab.setFont(RemarksLab.getFont().deriveFont(20.0f));
        DiscountLab.setFont(DiscountLab.getFont().deriveFont(20.0f));
        PayWayLab.setFont(PayWayLab.getFont().deriveFont(20.0f));
        Thanks.setFont(Thanks.getFont().deriveFont(40.0f));

        // 把元件加到BottomPanel裡
        BottomPanel.add(RemarksLab);
        BottomPanel.add(DiscountLab);
        BottomPanel.add(PayWayLab);
        BottomPanel.add(Thanks);

        // 設定三個panel的位置.大小
        TopPanel.setBounds(40, 20, 700, 80);
        jscrollpane.setBounds(40, 100, 700, 120);
        jscrollpane2.setBounds(40, 230, 700, 120);
        BottomPanel.setBounds(40, 370, 700, 300);

        // 加入panel
        contentPane.add(TopPanel);
        contentPane.add(jscrollpane);
        contentPane.add(jscrollpane2);
        contentPane.add(BottomPanel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}