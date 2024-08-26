import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem5 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("Source.txt");
            if(Files.exists(path)){
                Files.delete(path);
                System.out.println("File deleted : ");
            }
            else{
                System.out.println("File doesn't exists : ");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
