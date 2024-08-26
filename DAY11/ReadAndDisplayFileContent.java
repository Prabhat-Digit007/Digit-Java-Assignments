import java.io.*;

public class ReadAndDisplayFileContent {
    public static void main(String[] args) {
        File file = new File("files/input.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
