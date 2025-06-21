class Logger{
    private static Logger instance;
    private Logger(){
        instance = this;
    }
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public  void logMessage(String str){
        System.out.println(str);
    }
}

public class SingletonPatternExample{
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        logger1.logMessage("This is logger 1");
        logger2.logMessage("This is logger 2");
        logger3.logMessage("This is logger 3");

        boolean areSameInstances = (logger1 == logger2) && (logger2 == logger3);
        System.out.println("Are all the logger instances same : "+areSameInstances);
    }
}