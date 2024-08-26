class Logger {
    private static Logger instance=null;
    private Logger(){
    }
    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
    }
}
