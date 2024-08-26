import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Problem14 {
    public static void main(String[] args) {
        Path file1 = Paths.get("file1.txt");
        Path file2 = Paths.get("file2.txt");

        try (FileChannel channel1 = FileChannel.open(file1, StandardOpenOption.READ);
             FileChannel channel2 = FileChannel.open(file2, StandardOpenOption.READ)) {

            if (channel1.size() != channel2.size()) {
                System.out.println("Files are not equal: different sizes");
                return;
            }

            long size = channel1.size();
            MappedByteBuffer buffer1 = channel1.map(FileChannel.MapMode.READ_ONLY, 0, size);
            MappedByteBuffer buffer2 = channel2.map(FileChannel.MapMode.READ_ONLY, 0, size);

            for (int i = 0; i < size; i++) {
                if (buffer1.get(i) != buffer2.get(i)) {
                    System.out.println("Files are not equal: content differs");
                    return;
                }
            }

            System.out.println("Files are equal");
        } catch (IOException e) {
            System.out.println("Error comparing files: " + e.getMessage());
        }
    }
}