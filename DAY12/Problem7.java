import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Problem7{
    public static void main(String[] args) {
        Path path = Paths.get("Dataset.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {

            long fileSize = fileChannel.size();
            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);

            fileChannel.read(buffer);
            buffer.flip();

            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}