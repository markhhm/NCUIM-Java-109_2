import java.util.ArrayList;

public class singleType {
    private int id;
    private String name;
    private int price;
    private int property;
    private Boolean breakfast;
    singleType(String id, String name, String price, String property, String breakfast){
        if (id != null) {
            setId(id);
            setName(name);
            setPrice(price);
            setProperty(property);
            setBreakfast(breakfast);
        } else {
            this.id = this.price = this.property = 0;
            this.name = null;
            this.breakfast = false;
        }
    }
    public int property_trans(String property){
        int temp = 0;
        if(property == "主餐") {
            temp = 1;
        } else if(property == "副餐") {
            temp = 2;
        } else if(property == "飲料") {
            temp = 3;
        }
        return temp;
    }
    public void setId(String id) { this.id = Integer.parseInt(id); }
    public void setName(String name) { this.name = name ; }
    public void setPrice(String price) { this.price = Integer.parseInt(price); }
    public void setProperty(String property) { this.property = property_trans(property); }
    public void setBreakfast(String breakfast) { this.breakfast = Boolean.parseBoolean(breakfast); }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getProperty() { return property; }
    public Boolean getBreakfast() { return breakfast; }
}
