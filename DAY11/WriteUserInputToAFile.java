import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInputToAFile {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("files/user_input.txt")){
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Write your heartfelt content : ");
                String line = scanner.nextLine();
                fileWriter.write(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
