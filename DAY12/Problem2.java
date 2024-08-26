import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("Dataset.txt");
            System.out.println("Enter data : ");
            Scanner scanner = new Scanner(System.in);
            String line =scanner.nextLine();


            if(!Files.exists(path)){
                Files.write(path,line.getBytes(),StandardOpenOption.CREATE);
            }
            else{
                Files.write(path,line.getBytes(),StandardOpenOption.APPEND);
                Files.write(path,System.getProperty("line.separator").getBytes(),StandardOpenOption.APPEND);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
