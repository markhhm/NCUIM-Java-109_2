public class OrderData {
//<洪祥銘--
    //這個class的目的是存我們訂單的各種資料
    static int[] Singlecount = new int[10];// 單點各餐點數量計數器，單點有十種
    static int[] Setcount = new int[9];// 套餐各餐點數量計數器，套餐三種 x 三種主餐
    static String CouponCode = "";//存客人使用過的優惠碼
    static String RemarksContent;//存客人的備註
    static int forhereCount = 1;//單點的訂單編號
    static int togoCount = 1;//外帶的訂單編號
    
    public static void Reset(){ //重置點單暫存區
        for(int i=0; i < 10 ; i++) {
            Singlecount[i] = 0;
        }
        for(int i=0; i < 9 ; i++) {
            Setcount[i] = 0;
        }
        CouponCode = "";
        RemarksContent = "";
        ShoppingCart.TotalContent = "";
    }
    public static int calculateTotal(){ //預設總價＝單點加上套餐
        return calculateSingle() + calculateSet();
    }
    public static int calculateSingle(){ //單點價格加總
        int SingleTotal = 0;
        for(int i=0; i < 10 ; i++) { //十種單點，以For迴圈做加總
            if(Singlecount[i] > 0){ //檢查該項是否有餐點
                SingleTotal += ShoppingCart.Single_Menu.get(i).getPrice() * Singlecount[i];//單點的價格 x 數量
            }
        }
        return SingleTotal; //回傳單點總價
    }
    public static int calculateSet(){ //套餐價格加總
        int SetTotal = 0;
        int onlyPrice = 0; //套餐總價必須帶有單點主餐的金額，因為CSV資料內的套餐是只有副餐價格
        for(int i = 0; i < 9 ; i++) { // 三主餐 x 三套餐
            if(Setcount[i] > 0) { // 檢查該項是否有餐點
                if(i <= 2){ // 0,1,2 為 麥香雞 ABC餐，以下類推
                    onlyPrice = ShoppingCart.Single_Menu.get(1).getPrice();
                } else if (i <= 5) {
                    onlyPrice = ShoppingCart.Single_Menu.get(6).getPrice();
                } else {
                    onlyPrice = ShoppingCart.Single_Menu.get(8).getPrice();
                }
                SetTotal += (onlyPrice + ShoppingCart.Set_Menu.get(i%3).getPrice()) * Setcount[i];//價格加總是單點套餐主餐加上套餐副餐
            }
        }
        return SetTotal;//回傳套餐總價
    }
//<洪祥銘
}

