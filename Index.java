import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Index{
    public static void main(String a[]){
        String[] cars = {"BMW", "Mercedes", "Toyota"};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
        for(String vehicles : cars){
            writer.write("\n" + vehicles);
        }
        writer.close();
        } catch (IOException e1) {
            
            e1.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("report.txt"))) {
        String line;
        while((line = reader.readLine()) != null)
            System.out.println(line);
        reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}