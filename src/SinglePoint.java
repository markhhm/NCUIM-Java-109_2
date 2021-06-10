import java.util.ArrayList;

public class SinglePoint{

    static ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
	static ArrayList<setType> Set_Menu = new ArrayList<setType>();

	private int No;
	private String Name;
	private int Price;

	public SinglePoint(){}

	public SinglePoint(int i){

		new MenuData(Single_Menu, Set_Menu);

		No = i;

		switch(i){

			case 1:
				Name = Single_Menu.get(0).getName();
				Price = 33;
				break;
			case 2:
				Name = "麥香雞  ";
				Price = 44;
				break;
			case 3:
				Name = "可樂(小)";
				Price = 28;
				break;
			case 4:
				Name = "雪碧(小)";
				Price = 28;
				break;
			case 5:
				Name = "薯條(中)";
				Price = 44;
				break;
			case 6:
				Name = "薯餅    ";
				Price = 30;
				break;
			case 7:
				Name = "滿福堡  ";
				Price = 48;
				break;
			case 8:
				Name = "薯條(大)";
				Price = 55;
				break;
			case 9:
				Name = "大麥克  ";
				Price = 72;
				break;
			case 10:
				Name = "玉米濃湯";
				Price = 40;
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