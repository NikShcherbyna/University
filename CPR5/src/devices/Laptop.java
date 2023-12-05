package devices;

public class Laptop extends ElectronicDevice{
    private double screenSize;

    public Laptop(String processor, int memory, int storage, double screenSize) {
        super(processor, memory, storage);
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Laptop - Processor: " + processor +
                ", Memory: " + memory + "GB, Storage: " + storage + "GB, Screen Size: " + screenSize + " inches");
    }
}
