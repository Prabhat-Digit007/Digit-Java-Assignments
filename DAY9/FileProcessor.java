package DAY9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    public static void main(String[] args) {
        List<String> filePaths = new ArrayList<>();
        processFiles(filePaths);
    }

    private static void processFiles(List<String> filePaths) {
        for (String line : filePaths) {
            BufferedReader reader = null;
            try {
                reader = new BufferedReader(new FileReader(line));
                String a;
                while ((a = reader.readLine()) != null) {
                    System.out.println(a);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }


}
