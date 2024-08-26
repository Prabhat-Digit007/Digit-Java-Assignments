import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem11 {
    public static void main(String[] args) {
        Path dir = Paths.get("source_directory");
        Path mergedFile = Paths.get("merged_output.txt");

        try (Stream<Path> paths = Files.list(dir);
             FileChannel mergedFileChannel = FileChannel.open(mergedFile, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            List<Path> filesToMerge = paths.filter(Files::isRegularFile).collect(Collectors.toList());

            for (Path file : filesToMerge) {
                try (FileChannel fileChannel = FileChannel.open(file, StandardOpenOption.READ)) {
                    ByteBuffer buffer = ByteBuffer.allocate((int) fileChannel.size());
                    fileChannel.read(buffer);
                    buffer.flip();
                    mergedFileChannel.write(buffer);
                }
            }

            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.out.println("Error merging files: " + e.getMessage());
        }
    }
}