import java.util.ArrayList;
public class Menu{
    public ArrayList<String> Single_Meal = new ArrayList<String>();
    public ArrayList<String> Set_Meal = new ArrayList<String>();
    public Menu(ArrayList<menuType> menu) {
        Single_Meal.addAll(new ReadCSV("Single_meal.csv").csvArrayList);
        Set_Meal.addAll(new ReadCSV("Set_meal.csv").csvArrayList);
        for (int i = 1; i < (Single_Meal.size() / 5); i++) {
            int k = i * 5;
            menuType temp = new menuType(Single_Meal.get(k), Single_Meal.get(k + 1), Single_Meal.get(k + 2), Single_Meal.get(k + 3), Single_Meal.get(k + 4));
            menu.add(temp);
        }
    }
}
class menuType{
    int id;
    String name;
    int price;
    int property;
    Boolean breakfast;
    menuType(String id, String name, String price, String property, String breakfast){
        this.id = Integer.parseInt(id);
        this.name = name;
        this.price = Integer.parseInt(price);
        this.property = property_trans(property);
        this.breakfast = Boolean.parseBoolean(breakfast);
    }
    public int property_trans(String property){
        int temp = 4;
        if(property == "主餐") {
            temp = 0;
        } else if(property == "副餐") {
            temp = 1;
        } else if(property == "飲料") {
            temp = 2;
        }
        return temp;
    }
}
