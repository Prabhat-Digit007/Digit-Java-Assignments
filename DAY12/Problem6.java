import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem6 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("Source.txt");
            if(check(path)){
                System.out.println("File Exists : ");
            }
            else{
                System.out.println("File doesn't exists : ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean check(Path path) {
        return Files.exists(path);
    }

}
