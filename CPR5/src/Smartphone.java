public class Smartphone extends ElectronicDevice{
    private String operatingSystem;

    public Smartphone(String brand, String model, String color, String operatingSystem) {
        super(brand, model, color);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        System.out.println("Smartphone - " + getBrand() + " " + getModel() +
                ", Color: " + getColor() + ", OS: " + getOperatingSystem());
    }
}
