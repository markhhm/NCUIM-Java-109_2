import java.util.ArrayList;
public class Main {
    static ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    static ArrayList<setType> Set_Menu = new ArrayList<setType>();
    public static void main(String[] args) {
        new Menu(Single_Menu, Set_Menu);
        System.out.println(Single_Menu.get(3).getPrice());
        System.out.println(Set_Menu.get(2).getDrink().getName());
    }
}
