package builder;

import devices.ElectronicDevice;
import devices.Smartphone;

public class SmartphoneBuilder implements ElectronicDeviceBuilder{
    private Smartphone smartphone;

    public SmartphoneBuilder() {
        this.smartphone = new Smartphone("", 0, 0, "");
    }

    @Override
    public void buildProcessor() {
        smartphone.processor = "Octa-Core";
    }

    @Override
    public void buildMemory() {
        smartphone.memory = 6;
    }

    @Override
    public void buildStorage() {
        smartphone.storage = 128;
    }

    public void buildOperatingSystem() {
        smartphone.operatingSystem = "Android";
    }

    @Override
    public ElectronicDevice getResult() {
        return smartphone;
    }
}
