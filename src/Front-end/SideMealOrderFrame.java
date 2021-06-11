import javax.swing.*;  //引用Swing套件
import java.awt.*;

public class SideMealOrderFrame extends JFrame{

    static ImageIcon SideMealIcon; //= new ImageIcon("image/smallFries.jpg");

    public SideMealOrderFrame(ImageIcon image){
        setImage(image);
    }

    public void setImage(ImageIcon image){
        SideMealIcon = image;
    }

    public ImageIcon getImage() {
        return SideMealIcon;
    }
    
    public static void OrderFrame(){

        JFrame frame = new JFrame("點餐"); 
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        //設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟
        frame.setLocationRelativeTo(null);

        // 建立一個JPanel的例項
        JPanel panel = new JPanel(); 
 
        //設定容器不使用佈局管理員
        panel.setLayout(null); 

        //建立標籤
        JLabel SideMealLab = new JLabel();
        JLabel SideMealQuantity = new JLabel("數量");

        //建立圖片物件
        ImageIcon reduceBtnIcon = new ImageIcon("image/reduceBtn.jpg");
		ImageIcon addBtnIcon = new ImageIcon("image/addBtn.jpg");

        SideMealLab.setIcon(SideMealIcon);

        //建立按鈕
        JButton reduceBtn = new JButton(reduceBtnIcon);
        JButton addBtn = new JButton(addBtnIcon);
        JButton Cancel = new JButton("取消");
        JButton Confirm = new JButton("確認");
        
        //設定位置大小 
        SideMealLab.setBounds(280,20,260,230);
        SideMealQuantity.setBounds(365,250,70,70);
        reduceBtn.setBounds(230,250,70,70);
        addBtn.setBounds(500,250,70,70);
        Cancel.setBounds(500, 360,100,60);
        Confirm.setBounds(650, 360,100,60);


        //將物件添加到panel
        panel.add(SideMealLab);
        panel.add(SideMealQuantity);
        panel.add(reduceBtn);
        panel.add(addBtn);
        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 

    }
}