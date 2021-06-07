import java.util.ArrayList;

public class singleType {
    int id;
    String name;
    int price;
    int property;
    Boolean breakfast;
    singleType(String id, String name, String price, String property, String breakfast){
        this.id = Integer.parseInt(id);
        this.name = name;
        this.price = Integer.parseInt(price);
        this.property = property_trans(property);
        this.breakfast = Boolean.parseBoolean(breakfast);
    }
    public int property_trans(String property){
        int temp = 4;
        if(property == "主餐") {
            temp = 0;
        } else if(property == "副餐") {
            temp = 1;
        } else if(property == "飲料") {
            temp = 2;
        }
        return temp;
    }
}
