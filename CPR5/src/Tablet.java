public class Tablet extends ElectronicDevice{
    private String screenSize;

    public Tablet(String brand, String model, String color, String screenSize) {
        super(brand, model, color);
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Tablet - " + getBrand() + " " + getModel() +
                ", Color: " + getColor() + ", Screen Size: " + getScreenSize());
    }
}
