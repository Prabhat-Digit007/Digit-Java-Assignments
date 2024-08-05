package DAY9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem4 {
    public static void main(String[] args) {

        try (
                BufferedReader reader1 = new BufferedReader(new FileReader("abc.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("def.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("combined.txt"))
        ) {
            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}