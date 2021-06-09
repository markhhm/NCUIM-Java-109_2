import javax.swing.*;  //引用Swing套件
import java.awt.*;

public class BurgerOrder extends JFrame{
    
    public static void BurgerOrder(){
        JFrame frame = new JFrame("點餐"); 
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        frame.setLocationRelativeTo(null);// --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟

        JPanel panel = new JPanel(); // 建立一個JPanel的例項 
 
        panel.setLayout(null); //設定容器不使用佈局管理員

        //建立標籤
        JLabel McMuffinLab = new JLabel();

        //建立圖片物件
        ImageIcon McMuffinIcon = new ImageIcon("image/McMuffin.jpg");

        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        McMuffinLab.setIcon(McMuffinIcon);

        //建立輸入框
        JTextField amount = new JTextField();
        
        //建立按鈕
        JButton reduceBtn = new JButton(reduceBtnIcon);
        JButton addBtn = new JButton(addBtnIcon);
        JButton Cancel = new JButton("取消");
        JButton Confirm = new JButton("確認");

        JButton setABtn = new JButton("A普通套餐");
        JButton setBBtn = new JButton("B薯餅套餐");
        JButton setCBtn = new JButton("C吃很飽套餐");

        //設定大小
        McMuffinLab.setSize(new Dimension(260,230));
        setABtn.setSize(new Dimension(260,80));
        setBBtn.setSize(new Dimension(260,80));
        setCBtn.setSize(new Dimension(260,80));

        amount.setSize(new Dimension(140,70));        
        reduceBtn.setSize(new Dimension(70,70));
        addBtn.setSize(new Dimension(70,70));
        Cancel.setSize(new Dimension(100,60));
        Confirm.setSize(new Dimension(100,60));

        //設定位置
        McMuffinLab.setLocation(100,40);
        setABtn.setLocation(500,60);
        setBBtn.setLocation(500,160);
        setCBtn.setLocation(500,260);

        amount.setLocation(170, 300);
        reduceBtn.setLocation(80, 300);
        addBtn.setLocation(340, 300);
        Cancel.setLocation(500, 360); 
        Confirm.setLocation(650, 360); 

        //將物件添加到panel
        panel.add(McMuffinLab);
        panel.add(setABtn);
        panel.add(setBBtn);
        panel.add(setCBtn);

        panel.add(amount);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 
    }
}