package devices;

public class Smartphone extends ElectronicDevice{
    public String operatingSystem;

    public Smartphone(String processor, int memory, int storage, String operatingSystem) {
        super(processor, memory, storage);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        System.out.println("Smartphone - Processor: " + processor +
                ", Memory: " + memory + "GB, Storage: " + storage + "GB, OS: " + operatingSystem);
    }
}
