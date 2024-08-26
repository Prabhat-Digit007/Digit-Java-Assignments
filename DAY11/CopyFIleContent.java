import java.io.*;

public class CopyFIleContent {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("files/source.txt")){
            int line;
            try(FileWriter fileWriter = new FileWriter("files/destination.txt")){
                while ((line = fileReader.read()) != -1) {
                    fileWriter.write((char)line);
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
