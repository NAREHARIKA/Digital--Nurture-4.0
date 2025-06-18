
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Starting the application...");
        logger2.log("Performing some operations.");

        if (logger1 == logger2) {
            System.out.println("✅ Only one instance of Logger is used.");
        } else {
            System.out.println("❌ Multiple instances exist!");
        }
    }
}
