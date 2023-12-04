import builder.*;
import devices.ElectronicDevice;

public class Main {
    public static void main(String[] args) {
        ElectronicDeviceBuilder desktopBuilder = new DesktopComputerBuilder();
        ElectronicDeviceBuilder laptopBuilder = new LaptopBuilder();
        ElectronicDeviceBuilder smartphoneBuilder = new SmartphoneBuilder();

        ElectronicDeviceDirector director = new ElectronicDeviceDirector();

        ElectronicDevice desktopComputer = director.buildElectronicDevice(desktopBuilder);
        ElectronicDevice laptop = director.buildElectronicDevice(laptopBuilder);
        ElectronicDevice smartphone = director.buildElectronicDevice(smartphoneBuilder);

        desktopComputer.displayInfo();
        laptop.displayInfo();
        smartphone.displayInfo();
    }
}