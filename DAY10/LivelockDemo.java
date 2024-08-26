class ResourceA {}
class ResourceB {}

public class LivelockDemo {
    private final ResourceA resourceA = new ResourceA();
    private final ResourceB resourceB = new ResourceB();

    public void method1() {
        while (true) {
            synchronized (resourceA) {
                if (Thread.holdsLock(resourceB)) {
                    System.out.println("Thread 1: Backing off");
                    continue;
                }
                synchronized (resourceB) {
                    System.out.println("Thread 1: Locked both resources");
                    break;
                }
            }
        }
    }

    public void method2() {
        while (true) {
            synchronized (resourceB) {
                if (Thread.holdsLock(resourceA)) {
                    System.out.println("Thread 2: Backing off");
                    continue;
                }
                synchronized (resourceA) {
                    System.out.println("Thread 2: Locked both resources");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        LivelockDemo demo = new LivelockDemo();
        Thread t1 = new Thread(demo::method1);
        Thread t2 = new Thread(demo::method2);

        t1.start();
        t2.start();
    }
}