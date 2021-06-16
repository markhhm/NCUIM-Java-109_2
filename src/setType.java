import java.util.ArrayList;
//<Hsiang-Ming>
//套餐的資料型態
public class setType {
    private char id;
    private String name;
    private singleType dish1;
    private singleType dish2;
    private singleType drink;
    private int price;

    setType(String id, String name, String dish1, String dish2, String drink, String price) { //建構子
        setId(id);
        setName(name);
        setDish1(dish1);
        setDish2(dish2);
        setDrink(drink);
        setPrice(price);
    }
    public singleType dish_trans(int dish){ //將原本套餐內的副餐轉成一筆單點的，方便日後存取，或是做客製化套餐
        if (dish != -1) { //副餐編號預設為0(-1)，若為0(-1)代表沒有該副餐
            ArrayList<singleType> Single_Menu_Ref = new ArrayList<singleType>();
            new MenuData(Single_Menu_Ref);//new一個單點菜單出來做為參考資料調用
            return Single_Menu_Ref.get(dish);
        } else {
            return new singleType(null, null, null, null, null);
        }
    }

    public void setId(String id) { this.id = id.charAt(0); }//把原本的string id 轉為 char
    public void setName(String name) { this.name = name ; }
    public void setDish1(String dish1) { this.dish1 = dish_trans(Integer.parseInt(dish1) - 1); }//把套餐內的副餐string轉為單點屬性，減一是因為不存入表頭的情況下，每個餐點的index值會比實際大ㄧ，故需減回，以下同理
    public void setDish2(String dish2) { this.dish2 = dish_trans(Integer.parseInt(dish2) - 1); }
    public void setDrink(String drink) { this.drink = dish_trans(Integer.parseInt(drink) - 1); }
    public void setPrice(String price) { this.price = Integer.parseInt(price); }
    public char getId() { return id; }
    public String getName() { return name; }
    public singleType getDish1() { return dish1; }
    public singleType getDish2() { return dish2; }
    public singleType getDrink() { return drink; }
    public int getPrice() { return price; }
    //<Hsiang-Ming>
}
