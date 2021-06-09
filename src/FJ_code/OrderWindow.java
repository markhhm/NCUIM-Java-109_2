import javax.swing.*;  //引用Swing套件
import java.awt.*;

public class OrderWindow extends JFrame{
    
    public static void OrderWindow(){
        JFrame frame = new JFrame("點餐"); 
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        frame.setLocationRelativeTo(null);// --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟

        JPanel panel = new JPanel(); // 建立一個JPanel的例項 
 
        panel.setLayout(null); //設定容器不使用佈局管理員

        //建立圖片
        JLabel label = new JLabel();
        ImageIcon smallFriesIcon = new ImageIcon("image/smallFries.jpg");
        label.setIcon(smallFriesIcon);

        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        //建立輸入框
        JTextField amount = new JTextField();
        
        //建立按鈕
        JButton reduceBtn = new JButton(reduceBtnIcon);
        JButton addBtn = new JButton(addBtnIcon);
        JButton Cancel = new JButton("取消");
        JButton Confirm = new JButton("確認");

        label.setSize(new Dimension(260,150));
        amount.setSize(new Dimension(140,70));        
        reduceBtn.setSize(new Dimension(70,70));
        addBtn.setSize(new Dimension(70,70));
        Cancel.setSize(new Dimension(100,60));
        Confirm.setSize(new Dimension(100,60));

        label.setLocation(270,80);
        amount.setLocation(340, 260);
        reduceBtn.setLocation(230, 260);
        addBtn.setLocation(520, 260);
        Cancel.setLocation(500, 360); 
        Confirm.setLocation(650, 360); 

        panel.add(label);
        panel.add(amount);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 
    }
}