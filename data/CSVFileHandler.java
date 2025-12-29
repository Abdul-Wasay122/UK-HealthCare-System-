package data;
import  java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileHandler {

    public static List<String[]> readCSV(String filePath) {
        List<String[]> records = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }
                records.add(line.split(",", -1));
            }
        }
            catch (IOException e){
                e.printStackTrace();
            }
            return records ;
        }
public static void writeCSV(String filePath, List<String> lines) {

try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
    for(String line: lines){
        bw.write(line);
        bw.newLine();
    }
} catch (IOException e) {
    e.printStackTrace();
}
    }

}