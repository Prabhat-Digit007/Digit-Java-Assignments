
class ResourceWithFinalizer implements AutoCloseable {
    public ResourceWithFinalizer() {
        System.out.println("ResourceWithFinalizer instance created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("ResourceWithFinalizer instance is being garbage collected");
        super.finalize();
    }

    @Override
    public void close() {
        System.out.println("ResourceWithFinalizer instance is being closed");
    }
}
public class ResourceManagementDemo {
    public static void main(String[] args) {
        try (ResourceWithFinalizer resource = new ResourceWithFinalizer()) {
            System.out.println("Using resource within try-with-resources");
        }

        ResourceWithFinalizer resource1 = new ResourceWithFinalizer();
        ResourceWithFinalizer resource2 = new ResourceWithFinalizer();

        resource1 = null;
        resource2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}