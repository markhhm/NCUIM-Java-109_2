import javax.swing.*;  //引用Swing套件
import java.awt.*;
import java.util.*;

public class ShoppingCart extends JFrame{
    
    public ShoppingCart(){

        JFrame frame = new JFrame("點餐"); 
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(1400, 900);
        frame.setLocationRelativeTo(null);// --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟

        JPanel panel = new JPanel(); // 建立一個JPanel的例項 
 
        panel.setLayout(null); //設定容器不使用佈局管理員

        String[][] data = {{"編號一","資料一", "4"},{"編號二","資料二", "4"},{"編號三","資料三", "4"}};
        String[] dataTitle = {"餐點","數量", "價錢"};       
        JTable jtable = new JTable(data, dataTitle);
        JScrollPane jscrollpane = new JScrollPane(jtable);
 
        jtable.setBounds(100,100,1000,100); //(x, y, width, height)


        //建立輸入框
        JTextField amount = new JTextField("備註");
        
        //建立按鈕
        JButton Cancel = new JButton("取消訂單");
        JButton Confirm = new JButton("結帳");

        //設定大小
        amount.setSize(new Dimension(1000,70));        
        Cancel.setSize(new Dimension(100,60));
        Confirm.setSize(new Dimension(100,60));

        //設定位置
        jtable.setLocation(100,100);
        amount.setLocation(100, 500);
        Cancel.setLocation(1000, 750); 
        Confirm.setLocation(1200, 750); 

        //將物件添加到panel
        panel.add(jscrollpane);
        panel.add(jtable);
        panel.add(amount);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 
        add(jscrollpane,BorderLayout.CENTER);
    }

    public static void main (String [] args){
        ShoppingCart ShoppingCart = new ShoppingCart();
        //ShoppingCart.ShoppingCart();
    } 
}