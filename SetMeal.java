public class SetMeal{

	private String Meal;
	private String No;
	private String Type;
	private int Price;

	public SetMeal(int j,int i){

		switch(j){

			case 2:
				switch(i){

					case 1:
						Meal = "麥香雞(A)      x1\n   薯條(中)\n   雪碧(小)";
						No = "A";
						Type = "普通套餐";
						Price = 104;
						break;
					case 2:
						Meal = "麥香雞(B)      x1\n   薯條(小)\n   薯餅\n   可樂(小)";
						No = "B";
						Type = "薯餅套餐";
						Price = 114;
						break;
					case 3:
						Meal = "麥香雞(C)      x1\n   薯條(大)\n   雪碧(小)";
						No = "C";
						Type = "吃很堡套餐";
						Price = 114;
						break;
				}
				break;

			case 7:
				switch(i){

					case 1:
						Meal = "滿福堡(A)      x1\n   薯條(中)\n   雪碧(小)";
						No = "A";
						Type = "普通套餐";
						Price = 108;
						break;
					case 2:
						Meal = "滿福堡(B)      x1\n   薯條(小)\n   薯餅\n   可樂(小)";
						No = "B";
						Type = "薯餅套餐";
						Price = 118;
						break;
					case 3:
						Meal = "滿福堡(C)      x1\n   薯條(大)\n   雪碧(小)";
						No = "C";
						Type = "吃很堡套餐";
						Price = 118;
						break;
				}
				break;

			case 9:
				switch(i){

					case 1:
						Meal = "大麥克(A)      x1\n   薯條(中)\n   雪碧(小)";
						No = "A";
						Type = "普通套餐";
						Price = 132;
						break;
					case 2:
						Meal = "大麥克(B)      x1\n   薯條(小)\n   薯餅\n   可樂(小)";
						No = "B";
						Type = "薯餅套餐";
						Price = 142;
						break;
					case 3:
						Meal = "大麥克(C)      x1\n   薯條(大)\n   雪碧(小)";
						No = "C";
						Type = "吃很堡套餐";
						Price = 142;
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

		return getMeal() + "             " + getPrice() + "元\n";
	}
}