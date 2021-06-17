//<蘇湘婷--
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//滿福堡Listener
class McMuffinOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.McMuffinFrame();
	}
}

//麥香雞Listener
class McChickenOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.McChickenFrame();
	}
}

//大麥克Listener
class BigMacOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		MainMeal mm = new MainMeal();
        mm.BigMacFrame();
	}
}

//小薯Listener
class smallFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.smallFriesFrame();
	}
}

//中薯Listener
class mediumFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.mediumFriesFrame();
	}
}

//大薯Listener
class largeFriesOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.largeFriesFrame();
	}
}

//薯餅Listener
class hashBrownOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.hashBrownFrame();
	}
}

//玉米濃湯Listener
class cornSoupOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.cornSoupFrame();
	}
}

//可樂Listener
class CokeOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.CokeFrame();
	}
}

//雪碧Listener
class SpriteOrderListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		SideMeal s = new SideMeal();
        s.SpriteFrame();
	}
}

//檢視購物車Listener
class ShoppingCartListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		ShoppingCart s = new ShoppingCart();
		s.ShoppingCartFrame();
	}
}

//確認結帳Listener
class DetailListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		OrderData.RemarksContent = ShoppingCart.Remarks.getText();
		Detail.Detail();
		ShoppingCart.frame.dispose();
		ShoppingCart.TotalContent = "";
		if(ShoppingCart.forHere.isSelected()){
            OrderData.forhereCount ++; //產生一個明細象徵訂單產生一筆，故下一位客人要使用的編號要加一
        }else{
            OrderData.togoCount ++;
        }
	}
}

//取消訂單Listener
class CancelListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "確定要取消訂單嗎? \n按下確認將清除所有餐點。", "取消訂單確認", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (result == JOptionPane.YES_OPTION){
			if (result == JOptionPane.YES_OPTION){
				ShoppingCart.frame.dispose();
				OrderData.Reset();
			}
		}
	}
}
//--蘇湘婷>

class ViewMenuListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
        ShoppingCart.frame.dispose();
    }
}

//<洪祥銘--
class VerificationListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		int check = CouponCheck();
		if(check != 0 && check <= 3){
			OrderData.CouponCode += ShoppingCart.Discount.getText() + " "; //把使用者用過的coupon存到一個string方便顯示
			ShoppingCart.CouponSingle(CouponList(check));// 單點的coupon，帶入單點的tablemodel
		} else if (check > 3) {
			OrderData.CouponCode += ShoppingCart.Discount.getText() + " ";
			ShoppingCart.CouponSet(CouponList(check));// 套餐的coupon，帶入套餐的tablemodel
		} else {
			JOptionPane.showMessageDialog(null,"Invalid Coupon","Fail",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("image/joptionpaneICON.png"));//如果coupon驗證失敗的話會跳出訊息告訴使用者
		}

	}
	public static int CouponCheck(){ //辨識使用者輸入的優惠代碼
		int value;
		if(ShoppingCart.Discount.getText().equals("Fries")) {
			value = 1;
		} else if(ShoppingCart.Discount.getText().equals("Coke")){
			value = 2;
		} else if(ShoppingCart.Discount.getText().equals("BigMac")){
			value = 3;
		} else if(ShoppingCart.Discount.getText().equals("SuperCoupon")){
			value = 4;
		} else if(ShoppingCart.Discount.getText().equals("單點一折")){
			value = 5;
		} else if(ShoppingCart.Discount.getText().equals("打折打到骨折")) {
			value = 6;
		} else {
			value = 0;
		}
		return value;
	}
	public static String[] CouponList(int check){
		String[] temp ;
		switch(check){
			case 1:
				temp = new String[]{(ShoppingCart.Single_Menu.get(7).getName()),"1","Free"};//把要存到tablemodel的string陣列丟到temp以回傳，以下同理
				break;
			case 2:
				temp = new String[]{(ShoppingCart.Single_Menu.get(2).getName()),"1","Free"};
				break;
			case 3:
				temp = new String[]{(ShoppingCart.Single_Menu.get(8).getName()),"1","Free"};
				break;
			case 4:
				temp = new String[]{(ShoppingCart.Single_Menu.get(1).getName() + "超滿足優惠"),(ShoppingCart.Single_Menu.get(7).getName()),(ShoppingCart.Single_Menu.get(7).getName()),(ShoppingCart.Single_Menu.get(9).getName()),"1","Free"};
				break;
			case 5:
				ShoppingCart.TotalContent = "總價格 "+((OrderData.calculateSingle()/10)+(OrderData.calculateSet()))+" 元";//這兩個優惠是價格優惠不需帶入model，直接調整購物車與明細的輸出內容，以下同理
				ShoppingCart.total.setText(ShoppingCart.TotalContent);
				temp = null;
				break;
			case 6:
				ShoppingCart.TotalContent = "總價格 "+(OrderData.calculateTotal()/20)+" 元";
				ShoppingCart.total.setText(ShoppingCart.TotalContent);
				temp = null;
				break;
			default:
				temp = null;
				break;
		}
		return temp;
	}
//<洪祥銘
}
