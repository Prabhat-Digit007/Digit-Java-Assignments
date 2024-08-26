import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SimpleTask implements Runnable {
    private final int taskId;

    public SimpleTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName());
    }
}

public class SimpleThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new SimpleTask(i));
        }

        executor.shutdown();
    }
}