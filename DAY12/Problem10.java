import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem10{
    public static void main(String[] args) {
        Path path = Paths.get("Dataset.txt");

        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}