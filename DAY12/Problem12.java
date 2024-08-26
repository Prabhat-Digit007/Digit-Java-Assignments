import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem12 {
    public static void main(String[] args) {
        Path originalFile = Paths.get("largefile.txt");
        Path tempFile = Paths.get("tempfile.txt");
        String targetText = "oldText";
        String replacementText = "newText";

        try (BufferedReader reader = Files.newBufferedReader(originalFile);
             BufferedWriter writer = Files.newBufferedWriter(tempFile)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(targetText, replacementText);
                writer.write(modifiedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }

        try {
            Files.delete(originalFile);
            Files.move(tempFile, originalFile);
            System.out.println("Text replacement completed successfully.");
        } catch (IOException e) {
            System.out.println("Error finalizing file operations: " + e.getMessage());
        }
    }
}