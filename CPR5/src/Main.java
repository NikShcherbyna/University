public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("Apple", "iPhone 12", "Space Gray", "iOS");
        Tablet samsungTablet = new Tablet("Samsung", "Galaxy Tab S7", "Mystic Black", "11 inches");

        iphone.displayInfo();
        samsungTablet.displayInfo();
    }
}