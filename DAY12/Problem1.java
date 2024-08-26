import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("Dataset.txt");
            if(!Files.exists(path)){
                System.out.println("No such files exists ");
            }
            else{
                try(Stream<String> lines = Files.lines(path)){
                    lines.forEach(System.out::println);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
