import java.util.ArrayList;
//<洪祥銘--
//這支程式的目的是把讀進來的CSV從原本都是String轉成我們想要的資料型別
public class MenuData{
    public ArrayList<String> Single_Meal = new ArrayList<String>();//宣告兩個空的ArrayList用來存放即將存進來的CSV檔案
    public ArrayList<String> Set_Meal = new ArrayList<String>();
    public MenuData(ArrayList<singleType> menu1, ArrayList<setType> menu2) {
        Single_Meal.addAll(new ReadCSV("Single_meal.csv").csvArrayList);//將單點的資料整筆加入Single_Meal這個ArrayList
        Set_Meal.addAll(new ReadCSV("Set_meal.csv").csvArrayList);//將套餐資料整筆加入Set_Meal這個ArrayList

        if (menu1 != null) {
            for (int i = 1; i < (Single_Meal.size() / 5); i++) {//單點的資料是五個為一筆，所以用For迴圈控制即將讀進去存放目標型別的ArrayList
                int k = i * 5; //Single_Meal的Index值，從五開始的原因是為了不存入第一列的表頭
                singleType temp1 = new singleType(Single_Meal.get(k), Single_Meal.get(k + 1), Single_Meal.get(k + 2), Single_Meal.get(k + 3), Single_Meal.get(k + 4));//把資料放到暫存的ArrayList，資料型別是我們自建的
                menu1.add(temp1);//把資料從暫存的ArrayList丟進去我們想放的ArrayList，而目標ArrayList透過建構子的引數來帶入，下方同理
            }
        }
        if (menu2 != null) {
            for (int i = 1; i < (Set_Meal.size() / 6); i++) {
                int k = i * 6;
                setType temp2 = new setType(Set_Meal.get(k), Set_Meal.get(k + 1), Set_Meal.get(k + 2), Set_Meal.get(k + 3), Set_Meal.get(k + 4), Set_Meal.get(k + 5));
                menu2.add(temp2);
            }
        }
    }

    public MenuData(ArrayList<singleType> single_menu_ref) { //OverLoading，有些情況只要單點的資料，所以寫了一個多載來使用存入方法
        this(single_menu_ref, null);
    }
}
//--洪祥銘>