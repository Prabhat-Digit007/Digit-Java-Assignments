import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Problem4 {
    public static void main(String[] args) {
        try{
            Path source = Paths.get("Dataset.txt");
            Path destination = Paths.get("Destination.txt");

            if(!Files.exists(source)){
                Files.copy(source,destination, StandardCopyOption.REPLACE_EXISTING);
            }
            else{
                Files.copy(source,destination,StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
