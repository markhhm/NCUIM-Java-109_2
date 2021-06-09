import javax.swing.*;  //引用Swing套件
import java.awt.*;
import java.util.*;


public class t1 extends JFrame{
    /*
        private String[][] data = {{"編號一","資料一", "4"},{"編號二","資料二", "4"},{"編號三","資料三", "4"}};
        private String[] dataTitle = {"餐點","數量", "價錢"};
        private JTable jtable = new JTable(data, dataTitle);
        private JScrollPane jscrollpane = new JScrollPane(jtable);
*/
        public t1() {
        String[][] data = {{"編號一","資料一", "4"},{"編號二","資料二", "4"},{"編號三","資料三", "4"}};
        String[] dataTitle = {"餐點","數量", "價錢"};
        JTable jtable = new JTable(data, dataTitle);            
        JScrollPane jscrollpane = new JScrollPane(jtable);

        setTitle("建立表格");
        setBounds(300,300,300,300);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jscrollpane,BorderLayout.CENTER);
        }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        t1 T = new t1(); 
    }
}
