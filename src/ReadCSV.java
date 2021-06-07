import java.io.*;
import java.util.ArrayList;

public class ReadCSV {
    String filename;
    ArrayList<String> csvArrayList = new ArrayList<String>();

    public ReadCSV(String filename) {
        this.filename = filename;

        File csvFile = new File(filename);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFile));
            String csvString;
            String[] arrayFinish;
            while((csvString = reader.readLine()) != null) {
                arrayFinish = csvString.split(",");
                for (String arrayFinishData : arrayFinish) {
                    csvArrayList.add(arrayFinishData);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}