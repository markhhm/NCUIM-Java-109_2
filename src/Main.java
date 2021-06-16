import java.util.ArrayList;
public class Main {
    public static void main(String [] args){
        Menu m = new Menu();
        OrderData.ResetCount();//重置點餐暫存區
        m.Menu();
    }
}
