import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Problem9 {
    public static void main(String[] args) {
        Path dir = Paths.get("source.txt");

        try (Stream<Path> paths = Files.list(dir)) {
            paths.filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error listing files: " + e.getMessage());
        }
    }
}