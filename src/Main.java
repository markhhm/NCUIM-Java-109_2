import java.util.ArrayList;
public class Main {
    static ArrayList<menuType> Single_Menu = new ArrayList<menuType>();
    public static void main(String[] args) {
        new Menu(Single_Menu);
        System.out.println(Single_Menu.get(2).name);
    }
}
