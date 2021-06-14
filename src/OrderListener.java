import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class McMuffinOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.McMuffinFrame();
	}
}

class McChickenOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.McChickenFrame();
	}
}

class BigMacOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.BigMacFrame();
	}
}

class smallFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.smallFriesFrame();
	}
}

class mediumFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.mediumFriesFrame();
	}
}

class largeFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.largeFriesFrame();
	}
}

class hashBrownOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.hashBrownFrame();
	}
}

class cornSoupOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.cornSoupFrame();
	}
}

class CokeOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.CokeFrame();
	}
}

class SpriteOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.SpriteFrame();
	}
}

class ShoppingCartListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {

		ShoppingCart.ShoppingCartFrame();
	}
}

class DetailListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Detail.Detail();
	}
}

class ViewMenuListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
        ShoppingCart.frame.dispose();
    }
}

class VerificationListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int check = CouponCheck();
		if(check != 0 && check <= 3){
			OrderData.CouponCode = ShoppingCart.Discount.getText();
			ShoppingCart.frame.dispose();
			ShoppingCart.ShoppingCartFrame();
			ShoppingCart.CouponSingle(CouponList(check));
		} else if (check > 3) {
			OrderData.CouponCode = ShoppingCart.Discount.getText();
			ShoppingCart.frame.dispose();
			ShoppingCart.ShoppingCartFrame();
			ShoppingCart.CouponSet(CouponList(check));
		} else {
			JOptionPane.showMessageDialog(null,"Invalid Coupon","Fail",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("image/joptionpaneICON.png"));
		}

	}
	public static int CouponCheck(){
		int value;
		if(ShoppingCart.Discount.getText().equals("Fries")) {
			value = 1;
		} else if(ShoppingCart.Discount.getText().equals("Coke")){
			value = 2;
		} else if(ShoppingCart.Discount.getText().equals("BigMac")){
			value = 3;
		} else if(ShoppingCart.Discount.getText().equals("SuperCoupon")){
			value = 4;
		} else {
			value = 0;
		}
		return value;
	}
	public static String[] CouponList(int check){
		String[] temp ;
		switch(check){
			case 1:
				temp = new String[]{(ShoppingCart.Single_Menu.get(7).getName()),"1","Free"};
				break;
			case 2:
				temp = new String[]{(ShoppingCart.Single_Menu.get(2).getName()),"1","Free"};
				break;
			case 3:
				temp = new String[]{(ShoppingCart.Single_Menu.get(8).getName()),"1","Free"};
				break;
			case 4:
				temp = new String[]{(ShoppingCart.Single_Menu.get(1).getName() + " 代碼兌換"),(ShoppingCart.Single_Menu.get(7).getName()),(ShoppingCart.Single_Menu.get(7).getName()),(ShoppingCart.Single_Menu.get(9).getName()),"1","Free"};
				break;
			default:
				temp = null;
				break;
		}
		return temp;
	}
	//TODO:改成用迴圈但我好累
}
