import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
    //<Hsiang-Ming>
    //這個class作為CSV的讀取器
    String filename;//要讀的檔案名稱
    ArrayList<String> csvArrayList = new ArrayList<String>();//宣告一個ArrayList作為讀入檔案的暫存區

    public ReadCSV(String filename) {
        this.filename = filename;

        File csvFile = new File(filename);//new一個檔案object

        try { //做error handling
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));//透過FileReader傳入BufferedReader逐行讀出
            String csvString; //宣告一個string連續收入BufferedReader讀出的string
            String[] arrayFinish;//宣告一個String陣列要放拆分過的String
            while((csvString = reader.readLine()) != null) {
                arrayFinish = csvString.split(",");//把連續String依照逗點分開，存入String陣列
                for (String arrayFinishData : arrayFinish) {
                    csvArrayList.add(arrayFinishData);//把String陣列內的元素依序存入剛開始宣告好的ArrayList
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();//Error handling
        }
    };
    //<Hsiang-Ming>
}