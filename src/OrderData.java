public class OrderData {

    static int[] Singlecount = new int[10];// 單點各餐點數量
    static int[] Setcount = new int[9];// 套餐各餐點數量
    static String CouponCode = "";//TODO: use ArrayList
    static String RemarksContent;
    static int forhereCount = 1;
    static int togoCount = 1;
    public static void ResetCount(){
        for(int i=0; i < 10 ; i++) {
            Singlecount[i] = 0;
        }
        for(int i=0; i < 9 ; i++) {
            Setcount[i] = 0;
        }
    }
    public static int calculateTotal(){
        return calculateSingle() + calculateSet();
    }
    public static int calculateSingle(){
        int SingleTotal = 0;
        for(int i=0; i < 10 ; i++) {
            if(Singlecount[i] > 0){
                SingleTotal += ShoppingCart.Single_Menu.get(i).getPrice() * Singlecount[i];
            }
        }
        return SingleTotal;
    }
    public static int calculateSet(){
        int SetTotal = 0;
        int onlyPrice = 0;
        for(int i = 0; i < 9 ; i++) {
            if(Setcount[i] > 0) {
                if(i <= 2){
                    onlyPrice = ShoppingCart.Single_Menu.get(1).getPrice();
                } else if (i <= 5) {
                    onlyPrice = ShoppingCart.Single_Menu.get(6).getPrice();
                } else {
                    onlyPrice = ShoppingCart.Single_Menu.get(8).getPrice();
                }
                SetTotal += (onlyPrice + ShoppingCart.Set_Menu.get(i%3).getPrice()) * Setcount[i];
            }
        }
        return SetTotal;
    }
}

