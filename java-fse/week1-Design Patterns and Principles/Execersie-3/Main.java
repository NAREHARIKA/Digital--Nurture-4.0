
public class Main {
    public static void main(String[] args) {
       
        Computer basicComputer = new Computer.Builder("Intel i5", 8)
                                  .build();

       
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", 32)
                                    .withSSD(true)
                                    .withGPU(true)
                                    .build();

        basicComputer.displayConfiguration();
        System.out.println("----------------------");
        gamingComputer.displayConfiguration();
    }
}
