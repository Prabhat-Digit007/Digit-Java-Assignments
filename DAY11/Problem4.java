import java.io.*;

public class Problem4 {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new FileReader("files/file1.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("files/file2.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("files/file3.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("files/merged_feedback.txt"))
        ){
            String line;
            while((line = br.readLine()) !=null){
                bw.write(line);
                bw.newLine();
            }

            while((line = br1.readLine()) !=null){
                bw.write(line);
                bw.newLine();
            }

            while((line = br2.readLine()) !=null){
                bw.write(line);
                bw.newLine();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
