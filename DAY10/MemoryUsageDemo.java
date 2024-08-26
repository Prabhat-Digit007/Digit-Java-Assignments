
import java.util.ArrayList;
import java.util.List;

class LargeData {
    private final int[] largeArray;

    public LargeData(int size) {
        this.largeArray = new int[size];
    }
}
public class MemoryUsageDemo {
    public static void main(String[] args) {
        List<LargeData> dataList = new ArrayList<>();
        int dataSize = 1000000;
        int numObjects = 100;

        for (int i = 0; i < numObjects; i++) {
            dataList.add(new LargeData(dataSize));
        }

        printMemoryUsage("Before clearing the list");

        dataList.clear();

        System.gc();

        printMemoryUsage("After clearing the list");
    }

    private static void printMemoryUsage(String message) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println(message + ": " + usedMemory / (1024 * 1024) + " MB");
    }
}