import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
//<洪祥銘--
    //這個class用來作csv的讀取器
    String filename;//宣告要讀的檔案名
    ArrayList<String> csvArrayList = new ArrayList<String>();//用來暫存讀入的csv的ArrayList

    public ReadCSV(String filename) {
        this.filename = filename;

        File csvFile = new File(filename);//new一個file把檔案讀進csvFile

        try { //error handling
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));//new一個FileReader透過BufferedReader讀入reader
            String csvString; //宣告string暫存BufferedReader產生的連續string
            String[] arrayFinish;//用來存分割後的String
            while((csvString = reader.readLine()) != null) {
                arrayFinish = csvString.split(",");//將讀入的連續string透過逗點分割
                for (String arrayFinishData : arrayFinish) {
                    csvArrayList.add(arrayFinishData);//透過for迴圈控制將分割後的String依序加入暫存的ArrayList
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();//Error handling
        }
    };
//--洪祥銘>
}