import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("files/text_file.txt"))){
            String line;
            int count=0;
            while((line = br.readLine()) != null){
                List<String> a= new ArrayList<>(Arrays.asList(line.split(" ")));
                System.out.println(line);
                count+=a.size();
            }
            System.out.println("count : "+count );


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
