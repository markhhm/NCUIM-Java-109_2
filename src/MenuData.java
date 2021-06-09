import java.util.ArrayList;
public class MenuData{
    public ArrayList<String> Single_Meal = new ArrayList<String>();
    public ArrayList<String> Set_Meal = new ArrayList<String>();
    public MenuData(ArrayList<singleType> menu1, ArrayList<setType> menu2) {
        Single_Meal.addAll(new ReadCSV("Single_meal.csv").csvArrayList);
        Set_Meal.addAll(new ReadCSV("Set_meal.csv").csvArrayList);

        for (int i = 1; i < (Single_Meal.size() / 5); i++) {
            int k = i * 5;
            singleType temp1 = new singleType(Single_Meal.get(k), Single_Meal.get(k + 1), Single_Meal.get(k + 2), Single_Meal.get(k + 3), Single_Meal.get(k + 4));
            menu1.add(temp1);
        }
        if (menu2 != null) {
            for (int i = 1; i < (Set_Meal.size() / 6); i++) {
                int k = i * 6;
                setType temp2 = new setType(Set_Meal.get(k), Set_Meal.get(k + 1), Set_Meal.get(k + 2), Set_Meal.get(k + 3), Set_Meal.get(k + 4), Set_Meal.get(k + 5));
                menu2.add(temp2);
            }
        }
    }

    public MenuData(ArrayList<singleType> single_menu_ref) {
        this(single_menu_ref, null);
    }
}
