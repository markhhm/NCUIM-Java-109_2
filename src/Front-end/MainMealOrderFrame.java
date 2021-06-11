import javax.swing.*; 
import java.awt.*;
import java.util.*;

public class MainMealOrderFrame extends JFrame{

    static ImageIcon MainMealIcon; 

    public MainMealOrderFrame(ImageIcon image){
        setImage(image);
    }

    public void setImage(ImageIcon image){
        MainMealIcon = image;
    }

    public ImageIcon getImage() {
        return MainMealIcon;
    }
    
    public static void OrderFrame(){
        JFrame frame = new JFrame("點餐"); 
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
        frame.setSize(800, 500); 
        frame.setLocationRelativeTo(null);// --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟

        JPanel panel = new JPanel(); // 建立一個JPanel的例項 
 
        panel.setLayout(null); //設定容器不使用佈局管理員

        //建立標籤
        JLabel MainMealLab = new JLabel();

        JLabel singleQuantity = new JLabel("數量");
        JLabel setAQuantity = new JLabel("數量");
        JLabel setBQuantity = new JLabel("數量");
        JLabel setCQuantity = new JLabel("數量");

        //建立圖片物件
        MainMealLab.setIcon(MainMealIcon);
        
        //建立按鈕
        JButton Cancel = new JButton("取消");
        JButton Confirm = new JButton("確認");

        JButton singleBtn = new JButton("單點");
        JButton setABtn = new JButton("A普通套餐");
        JButton setBBtn = new JButton("B薯餅套餐");
        JButton setCBtn = new JButton("C吃很飽套餐");

        //設定位置大小 
        MainMealLab.setBounds(50,50,260,230);
        singleBtn.setBounds(350,20,260,60);
        setABtn.setBounds(350,100,260,60);
        setBBtn.setBounds(350,180,260,60);
        setCBtn.setBounds(350,260,260,60);

        singleQuantity.setBounds(650,20,60,60);
        setAQuantity.setBounds(650,100,60,60);
        setBQuantity.setBounds(650,180,60,60);
        setCQuantity.setBounds(650,260,60,60);

        Cancel.setBounds(500,360,100,60);
        Confirm.setBounds(650,360,100,60);


        //將物件添加到panel
        panel.add(MainMealLab);
        panel.add(singleBtn);
        panel.add(setABtn);
        panel.add(setBBtn);
        panel.add(setCBtn);

        panel.add(singleQuantity);
        panel.add(setAQuantity);
        panel.add(setBQuantity);
        panel.add(setCQuantity);

        panel.add(Cancel);
        panel.add(Confirm);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 
    }
}