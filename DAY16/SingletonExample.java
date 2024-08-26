class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            return instance;
        }
        return null;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
