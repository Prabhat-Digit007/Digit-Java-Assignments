import java.io.*;

public class CopyingFileContents {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("files/source.txt"))){
            String line;
            while((line = br.readLine()) != null){
                try(BufferedWriter bw = new BufferedWriter(new FileWriter("files/destination.txt",true))){
                    bw.write(line);
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
