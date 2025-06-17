class SimplePrinter {
    
    private static volatile SimplePrinter instance;

    
    private SimplePrinter() {
        System.out.println("SimplePrinter Initialized");
    }

    
    public static SimplePrinter getInstance() {
        if (instance == null) {
            synchronized (SimplePrinter.class) {
                if (instance == null) {
                    instance = new SimplePrinter();
                }
            }
        }
        return instance;
    }

    
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

public class SimpleSingleton {
    public static void main(String[] args) {
        SimplePrinter printer1 = SimplePrinter.getInstance();
        SimplePrinter printer2 = SimplePrinter.getInstance();
        printer1.print("Singleton Pattern - Week 1");
        printer2.print("Hands-on Assignment");

        if (printer1 == printer2) {
            System.out.println("✅ Both printers are the same instance.");
        } else {
            System.out.println("❌ Different instances created!");
        }
    }
}
