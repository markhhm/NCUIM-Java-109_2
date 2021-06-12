import java.util.ArrayList;

public class SinglePoint{

    ArrayList<singleType> Single_Menu = new ArrayList<singleType>();

	private int No;
	private String Name;
	private int Price;

	public SinglePoint(){}

	public SinglePoint(int i){

		new MenuData(Single_Menu);

		No = i;

		switch(i){

			case 1:
				Name = Single_Menu.get(0).getName();
				Price = Single_Menu.get(0).getPrice();
				break;
			case 2:
				Name = Single_Menu.get(1).getName();
				Price = Single_Menu.get(1).getPrice();
				break;
			case 3:
				Name = Single_Menu.get(2).getName();
				Price = Single_Menu.get(2).getPrice();
				break;
			case 4:
				Name = Single_Menu.get(3).getName();
				Price = Single_Menu.get(3).getPrice();
				break;
			case 5:
				Name = Single_Menu.get(4).getName();
				Price = Single_Menu.get(4).getPrice();
				break;
			case 6:
				Name = Single_Menu.get(5).getName();
				Price = Single_Menu.get(5).getPrice();
				break;
			case 7:
				Name = Single_Menu.get(6).getName();
				Price = Single_Menu.get(6).getPrice();
				break;
			case 8:
				Name = Single_Menu.get(7).getName();
				Price = Single_Menu.get(7).getPrice();
				break;
			case 9:
				Name = Single_Menu.get(8).getName();
				Price = Single_Menu.get(8).getPrice();
				break;
			case 10:
				Name = Single_Menu.get(9).getName();
				Price = Single_Menu.get(9).getPrice();
				break;
		}
	}

	public int getNo(){

		return No;

	}

	public String getName(){

		return Name;

	}

	public int getPrice(){

		return Price;

	}


	public String toString(){

		return getName() + "     ";
	}
}