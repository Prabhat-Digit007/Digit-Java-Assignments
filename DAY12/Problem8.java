import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Problem8 {
    public static void main(String[] args) {
        Path path = Paths.get("Dataset.txt");
        
        try(FileChannel fileChannel = FileChannel.open(path)){
            long fileSize = fileChannel.size();
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) fileSize);

            fileChannel.read(byteBuffer);
            byteBuffer.flip();

            while(byteBuffer.hasRemaining()){
                fileChannel.write(byteBuffer);
                System.out.println("Value : "+(char)byteBuffer.get());
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
