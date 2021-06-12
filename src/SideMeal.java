import javax.swing.*;  //引用Swing套件
import java.awt.*;

public class SideMeal{
    static ImageIcon smallFriesIcon = new ImageIcon("image/smallFries.jpg");
    static ImageIcon mediumFriesIcon = new ImageIcon("image/mediumFries.jpg");
    static ImageIcon largeFriesIcon = new ImageIcon("image/largeFries.jpg");
    static ImageIcon hashBrownIcon = new ImageIcon("image/hashBrown.jpg");
    static ImageIcon cornSoupIcon = new ImageIcon("image/cornSoup.jpg");
    static ImageIcon CokeIcon = new ImageIcon("image/Coke.jpg");
    static ImageIcon SpriteIcon = new ImageIcon("image/Sprite.jpg");

    public static void smallFriesFrame(){
        SideMealOrderFrame smallFriesOrderFrame = new SideMealOrderFrame(smallFriesIcon);
        smallFriesOrderFrame.OrderFrame(0);
    }

    public static void mediumFriesFrame(){
        SideMealOrderFrame mediumFriesOrderFrame = new SideMealOrderFrame(mediumFriesIcon);
        mediumFriesOrderFrame.OrderFrame(4);
    }

    public static void largeFriesFrame(){
        SideMealOrderFrame largeFriesOrderFrame = new SideMealOrderFrame(largeFriesIcon);
        largeFriesOrderFrame.OrderFrame(7);
    }

    public static void hashBrownFrame(){
        SideMealOrderFrame hashBrownOrderFrame = new SideMealOrderFrame(hashBrownIcon);
        hashBrownOrderFrame.OrderFrame(5);
    }

    public static void cornSoupFrame(){
        SideMealOrderFrame cornSoupOrderFrame = new SideMealOrderFrame(cornSoupIcon);
        cornSoupOrderFrame.OrderFrame(9);
    }

    public static void CokeFrame(){
        SideMealOrderFrame CokeOrderFrame = new SideMealOrderFrame(CokeIcon);
        CokeOrderFrame.OrderFrame(2);
    }

    public static void SpriteFrame(){
        SideMealOrderFrame SpriteOrderFrame = new SideMealOrderFrame(SpriteIcon);
        SpriteOrderFrame.OrderFrame(3);
    }
}