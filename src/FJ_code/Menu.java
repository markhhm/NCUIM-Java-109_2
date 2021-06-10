import javax.swing.*;  //引用Swing套件
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

	public static void Menu() { 
		JFrame frame = new JFrame("麥當勞點餐系統"); 
		Container contentPane = frame.getContentPane();

        // 設定圖示
     	frame.setIconImage(frame.getToolkit().getImage("image/logo.jpg"));
		contentPane.setBackground(Color.yellow); // 將JFrame例項背景設定為黃色 
		frame.setSize(1400, 900); 
		frame.setLocationRelativeTo(null);// --> 設定開啟的位置和某個物件相同，帶入null則會在畫面中間開啟

		JPanel panel = new JPanel(); // 建立一個JPanel的例項 
		panel.setBackground(Color.red); // 將JPanel的例項背景設定為紅色 

 		panel.setLayout(null); //設定容器不使用佈局管理員
	
		//建立圖片物件
		ImageIcon shoppingCartButtonIcon = new ImageIcon("image/shoppingCart.jpg");
		ImageIcon setAButtonIcon = new ImageIcon("image/setA.jpg");
		ImageIcon setBButtonIcon = new ImageIcon("image/setB.jpg");
		ImageIcon setCButtonIcon = new ImageIcon("image/setC.jpg");

		ImageIcon McMuffinButtonIcon = new ImageIcon("image/McMuffin.jpg");
		ImageIcon McChickenButtonIcon = new ImageIcon("image/McChicken.jpg");
		ImageIcon BigMacButtonIcon = new ImageIcon("image/BigMac.jpg");

		ImageIcon smallFriesButtonIcon = new ImageIcon("image/smallFries.jpg");
		ImageIcon mediumFriesButtonIcon = new ImageIcon("image/mediumFries.jpg");
		ImageIcon largeFriesButtonIcon = new ImageIcon("image/largeFries.jpg");
		ImageIcon hashBrownButtonIcon = new ImageIcon("image/hashBrown.jpg");
		ImageIcon cornSoupButtonIcon = new ImageIcon("image/cornSoup.jpg");

		ImageIcon CokeButtonIcon = new ImageIcon("image/Coke.jpg");
		ImageIcon SpriteButtonIcon = new ImageIcon("image/Sprite.jpg");

		//宣告按鈕元件
 		JButton shoppingCart = new JButton("檢視購物車", shoppingCartButtonIcon); 

 		JButton setA = new JButton(setAButtonIcon);
		JButton setB = new JButton(setBButtonIcon);
		JButton setC = new JButton(setCButtonIcon);

 		JButton McMuffin = new JButton(McMuffinButtonIcon);
		JButton McChicken = new JButton(McChickenButtonIcon);
		JButton BigMac = new JButton(BigMacButtonIcon);

 		JButton smallFries = new JButton(smallFriesButtonIcon);
		JButton mediumFries = new JButton(mediumFriesButtonIcon);
		JButton largeFries = new JButton(largeFriesButtonIcon);
 		JButton hashBrown = new JButton(hashBrownButtonIcon);
		JButton cornSoup = new JButton(cornSoupButtonIcon);

		JButton Coke = new JButton(CokeButtonIcon);
		JButton Sprite = new JButton(SpriteButtonIcon);

		//設定按鈕大小
 		shoppingCart.setSize(new Dimension(300,60)); 
		setA.setSize(new Dimension(520,230)); 
		setB.setSize(new Dimension(520,230)); 
		setC.setSize(new Dimension(520,230)); 

		McMuffin.setSize(new Dimension(260,230)); 
		McChicken.setSize(new Dimension(260,230)); 
		BigMac.setSize(new Dimension(260,230)); 

		smallFries.setSize(new Dimension(260,150)); 
		mediumFries.setSize(new Dimension(260,150)); 
		largeFries.setSize(new Dimension(260,150));
 		hashBrown.setSize(new Dimension(260,230)); 
		cornSoup.setSize(new Dimension(260,230)); 

		Coke.setSize(new Dimension(260,230)); 
		Sprite.setSize(new Dimension(260,230)); 

		//設定元件位置
 		shoppingCart.setLocation(1070, 20); 
 		setA.setLocation(850, 110); 
 		setB.setLocation(850, 360); 
 		setC.setLocation(850, 610); 

 		McMuffin.setLocation(20, 110); 
 		McChicken.setLocation(300, 110); 
 		BigMac.setLocation(580, 110); 

 		smallFries.setLocation(20, 360); 
 		mediumFries.setLocation(20, 520); 
 		largeFries.setLocation(20, 680); 
 		hashBrown.setLocation(300, 360); 
 		cornSoup.setLocation(580, 360); 

 		Coke.setLocation(300, 610); 
 		Sprite.setLocation(580, 610); 


		//加入觸發物件
		McMuffin.addActionListener(new McMuffinOrder());
		smallFries.addActionListener(new smallFriesOrder());

		//將元件加入容器
 		panel.add(shoppingCart); 
 		panel.add(setA);
 		panel.add(setB);
 		panel.add(setC);

 		panel.add(McMuffin);
 		panel.add(McChicken);
 		panel.add(BigMac);

 		panel.add(smallFries);
 		panel.add(mediumFries);
 		panel.add(largeFries);
 		panel.add(hashBrown);
 		panel.add(cornSoup);

 		panel.add(Coke);
 		panel.add(Sprite);

		contentPane.add(panel); // 將JPanel例項新增到JFrame
		frame.setVisible(true); 
	}
}

class McMuffinOrder implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	   BurgerOrder.BurgerOrder();
	}
}

class smallFriesOrder implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		OrderWindow.OrderWindow();
	}
}