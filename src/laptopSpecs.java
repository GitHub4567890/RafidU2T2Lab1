public class laptopSpecs {
    private String model; //comment
    private String cpu;
    private int storage;

    public laptopSpecs(String laptopModel, String processorModel, int laptopStorage) {
        model = laptopModel;
        cpu = processorModel;
        storage = laptopStorage;
    }

    public void printLaptopInfo() {
        System.out.println("Laptop Model: " + model);
        System.out.println("Laptop CPU/Processor Model: " + cpu);
        System.out.println("Laptop Storage Capacity: " + storage);
    }
}
