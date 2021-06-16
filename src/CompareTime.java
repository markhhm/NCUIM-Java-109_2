//<蘇湘婷--
import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTime{
    public static boolean CompareTime(){
        //set date format
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        // create a LocalTime object
        LocalTime timeNow = LocalTime.parse(time.format(new Date()));
  
        // create other LocalTime
        LocalTime changeTime = LocalTime.parse("10:30:00");
  
        // check if LocalTime is before LocalTime
        // using isBefore()
        return timeNow.isBefore(changeTime);
    }
}
//--蘇湘婷>
