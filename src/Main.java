import java.util.ArrayList;
public class Main {
    static ArrayList<String> Single_Meal = new ArrayList<String>();
    static ArrayList<String> Set_Meal = new ArrayList<String>();
    public static void main(String[] args) {
        Single_Meal.addAll(new ReadCSV("Single_meal.csv").csvArrayList);
        Set_Meal.addAll(new ReadCSV("Set_meal.csv").csvArrayList);
        System.out.println(Set_Meal.get(5));
    }

}
