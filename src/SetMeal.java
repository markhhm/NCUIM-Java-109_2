import java.util.ArrayList;

public class SetMeal{

	ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    ArrayList<setType> Set_Menu = new ArrayList<setType>();

	private String Meal;
	private String No;
	private String Type;
	private int Price;

	public SetMeal(int j,int i){

		new MenuData(Single_Menu, Set_Menu);

		switch(j){

			case 2:
				switch(i){

					case 1:
						Meal = Single_Menu.get(1).getName() + "\n" + Set_Menu.get(0).getDish1().getName() + "\n" + Set_Menu.get(0).getDrink().getName();
						No = "A";
						Price = Single_Menu.get(1).getPrice() + Set_Menu.get(0).getPrice();
						break;
					case 2:
						Meal = Single_Menu.get(1).getName() + "\n" + Set_Menu.get(1).getDish1().getName() + "\n" + Set_Menu.get(1).getDish2().getName() + "\n" + Set_Menu.get(1).getDrink().getName();
						No = "B";
						Price = Single_Menu.get(1).getPrice() + Set_Menu.get(1).getPrice();
						break;
					case 3:
						Meal = Single_Menu.get(1).getName() + "\n" + Set_Menu.get(2).getDish1().getName() + "\n" + Set_Menu.get(2).getDrink().getName();
						No = "C";
						Price = Single_Menu.get(1).getPrice() + Set_Menu.get(2).getPrice();
						break;
				}
				break;

			case 7:
				switch(i){

					case 1:
						Meal = Single_Menu.get(6).getName() + "\n" + Set_Menu.get(0).getDish1().getName() + "\n" + Set_Menu.get(0).getDrink().getName();
						No = "A";
						Price = Single_Menu.get(6).getPrice() + Set_Menu.get(0).getPrice();
						break;
					case 2:
						Meal = Single_Menu.get(6).getName() + "\n" + Set_Menu.get(1).getDish1().getName() + "\n" + Set_Menu.get(1).getDish2().getName() + "\n" + Set_Menu.get(1).getDrink().getName();
						No = "B";
						Price = Single_Menu.get(6).getPrice() + Set_Menu.get(1).getPrice();
						break;
					case 3:
						Meal = Single_Menu.get(6).getName() + "\n" + Set_Menu.get(2).getDish1().getName() + "\n" + Set_Menu.get(2).getDrink().getName();
						No = "C";
						Price = Single_Menu.get(6).getPrice() + Set_Menu.get(2).getPrice();
						break;
				}
				break;

			case 9:
				switch(i){

					case 1:
						Meal = Single_Menu.get(8).getName() + "\n" + Set_Menu.get(0).getDish1().getName() + "\n" + Set_Menu.get(0).getDrink().getName();
						No = "A";
						Price = Single_Menu.get(8).getPrice() + Set_Menu.get(0).getPrice();
						break;
					case 2:
						Meal = Single_Menu.get(8).getName() + "\n" + Set_Menu.get(1).getDish1().getName() + "\n" + Set_Menu.get(1).getDish2().getName() + "\n" + Set_Menu.get(1).getDrink().getName();
						No = "B";
						Price = Single_Menu.get(8).getPrice() + Set_Menu.get(1).getPrice();
						break;
					case 3:
						Meal = Single_Menu.get(8).getName() + "\n" + Set_Menu.get(2).getDish1().getName() + "\n" + Set_Menu.get(2).getDrink().getName();
						No = "C";
						Price = Single_Menu.get(8).getPrice() + Set_Menu.get(2).getPrice();
						break;
				}
				break;
		}
	}

	public String getMeal(){

		return Meal;

	}

	public String getNo(){

		return No;

	}

	public String getType(){

		return Type;

	}

	public int getPrice(){

		return Price;

	}

	public String toString(){

		return getMeal();
	}
}