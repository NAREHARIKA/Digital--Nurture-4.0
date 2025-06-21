
public class Computer {
    private String cpu;
    private int ram;
    private boolean hasSSD;
    private boolean hasGPU;
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hasSSD = builder.hasSSD;
        this.hasGPU = builder.hasGPU;
    }

    public void displayConfiguration() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("SSD: " + (hasSSD ? "Yes" : "No"));
        System.out.println("GPU: " + (hasGPU ? "Yes" : "No"));
    }
     public static class Builder {
        private String cpu;
        private int ram;
        private boolean hasSSD;
        private boolean hasGPU;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder withSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public Builder withGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
