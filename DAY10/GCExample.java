
public class GCExample {
    public GCExample() {
        System.out.println("GCExample instance created");
    }

    protected void Finalize() throws Throwable {
        System.out.println("GCExample instance is being garbage collected");
    }

    public static void main(String[] args) {

        GCExample obj1 = new GCExample();
        GCExample obj2 = new GCExample();
        GCExample obj3 = new GCExample();

        obj1 = null;
        obj2 = null;
        obj3 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}