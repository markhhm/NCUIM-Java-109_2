import java.util.ArrayList;

public class setType {
    private char id;
    private String name;
    private singleType dish1;
    private singleType dish2;
    private singleType drink;
    private int price;

    setType(String id, String name, String dish1, String dish2, String drink, String price) {
        setId(id);
        setName(name);
        setDish1(dish1);
        setDish2(dish2);
        setDrink(drink);
        setPrice(price);
    }
    public singleType dish_trans(int dish){
        if (dish != -1) {
            ArrayList<singleType> Single_Menu_Ref = new ArrayList<singleType>();
            new Menu(Single_Menu_Ref);
            return Single_Menu_Ref.get(dish);
        } else {
            return new singleType(null, null, null, null, null);
        }
    }

    public void setId(String id) { this.id = id.charAt(0); }
    public void setName(String name) { this.name = name ; }
    public void setDish1(String dish1) { this.dish1 = dish_trans(Integer.parseInt(dish1) - 1); }
    public void setDish2(String dish2) { this.dish2 = dish_trans(Integer.parseInt(dish2) - 1); }
    public void setDrink(String drink) { this.drink = dish_trans(Integer.parseInt(drink) - 1); }
    public void setPrice(String price) { this.price = Integer.parseInt(price); }
    public char getId() { return id; }
    public String getName() { return name; }
    public singleType getDish1() { return dish1; }
    public singleType getDish2() { return dish2; }
    public singleType getDrink() { return drink; }
    public int getPrice() { return price; }
}
