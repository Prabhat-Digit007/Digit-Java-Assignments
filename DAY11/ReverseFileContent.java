import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("files/input.txt"))){
            String line;
            while((line= br.readLine())!=null){
                StringBuilder s = new StringBuilder(line);
                s.reverse();
                try(BufferedWriter bw = new BufferedWriter(new FileWriter("files/reversed.txt",true))){
                    bw.write(s.toString());
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
