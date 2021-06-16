//<蘇湘婷--
import javax.swing.*; 
import java.awt.*;

public class MainMeal{
    static ImageIcon McMuffinIcon = new ImageIcon("image/McMuffin.jpg");
    static ImageIcon McChickenIcon = new ImageIcon("image/McChicken.jpg");
    static ImageIcon BigMacIcon = new ImageIcon("image/BigMac.jpg");

    public static void McMuffinFrame(){
        MainMealOrderFrame McMuffinOrderFrame = new MainMealOrderFrame(McMuffinIcon);
        McMuffinOrderFrame.OrderFrame(6);//引數是套餐主餐的索引
    }

    public static void McChickenFrame(){
        MainMealOrderFrame McChickenOrderFrame = new MainMealOrderFrame(McChickenIcon);
        McChickenOrderFrame.OrderFrame(1);//引數是套餐主餐的索引
    }

    public static void BigMacFrame(){
        MainMealOrderFrame BigMacOrderFrame = new MainMealOrderFrame(BigMacIcon);
        BigMacOrderFrame.OrderFrame(8);//引數是套餐主餐的索引
    }

}
//--蘇湘婷>