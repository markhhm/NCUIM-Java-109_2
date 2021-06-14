import java.util.ArrayList;
import javax.swing.table.*;
import javax.swing.*;

public class AssignOrderData {
    static ArrayList<singleType> Single_Menu = new ArrayList<singleType>();
    static ArrayList<setType> Set_Menu = new ArrayList<setType>();
    public static void AssignSingleOrderData(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < 10 ; i++) {
            if (OrderData.Singlecount[i] > 0) {
                model.addRow(new Object[]{(Single_Menu.get(i).getName()),(OrderData.Singlecount[i]+""),((Single_Menu.get(i).getPrice() * OrderData.Singlecount[i])+"")});
            }
        }
    }

    public static void AssignSetOrderData(DefaultTableModel model){
        String MainMealName = null;
        for (int i = 0; i < 9 ; i++) {
            if (OrderData.Setcount[i] > 0) {
                switch (OrderData.Setcount[i]){
                    case 0:
                    case 1:
                    case 2:
                        MainMealName = Single_Menu.get(1).getName();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        MainMealName = Single_Menu.get(6).getName();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        MainMealName = Single_Menu.get(6).getName();
                        break;
                }
                model.addRow(new Object[]{MainMealName, (Set_Menu.get(i).getDish1().getName()), (Set_Menu.get(i).getDish2().getName()), (Set_Menu.get(i).getDrink().getName()), OrderData.Setcount[i], (Set_Menu.get(i).getPrice() * OrderData.Singlecount[i])+""});
                //shoppingCartSingleData.add(OrderData.Singlecount[i]+"");
                //shoppingCartSingleData.add(Single_Menu.get(i).getPrice() * OrderData.Singlecount[i]+"");
            }
        }
    }
//    public static String[][] assignData(){
//        int k = 0;
//        for (int i = 0; i < 10 ; i++) {
//            if (OrderData.Singlecount[i] > 0) {
//                shoppingCartSingleData[k][0] += Single_Menu.get(i).getName();
//                shoppingCartSingleData[k][1] += OrderData.Singlecount[i];
//                shoppingCartSingleData[k][2] += Single_Menu.get(i).getPrice() * OrderData.Singlecount[i];
//                k++;
//            }
//        }
//        return shoppingCartSingleData;
//    }
//    public static int singleCountTotal(){
//        int value = 0;
//        for (int i = 0; i < 10 ; i++) {
//            if (OrderData.Singlecount[i] > 0) {
//                value ++;
//            }
//        }
//        System.out.println(value);
//        return value;
//    };
}
