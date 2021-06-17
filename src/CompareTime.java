//<蘇湘婷--
import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTime{
    public static boolean CompareTime(){
        //時間格式化輸出，HH為24小時制
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        //LocalTime 表示不含日期的時間， Date()物件:使用內件的日期物件與方法取得操作時的日期時間
        //LocalTime.parse() ->  parse 字串成 LocalTime
        LocalTime timeNow = LocalTime.parse(time.format(new Date()));
  
        //換餐點的時間10:30
        LocalTime changeTime = LocalTime.parse("10:30:00");
  
        //用isBefore()判斷現在時間是不是在換餐點的時間前，回傳boolean值
        return timeNow.isBefore(changeTime);
    }
}   
//--蘇湘婷>