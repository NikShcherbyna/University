package builder;

import builder.ElectronicDeviceBuilder;
import devices.ElectronicDevice;
import devices.Laptop;

public class LaptopBuilder implements ElectronicDeviceBuilder {
    private Laptop computer;

    public LaptopBuilder() {
        this.computer = new Laptop("", 0, 0, 0.0);
    }

    @Override
    public void buildProcessor() {
        computer.processor = "AMD Ryzen 5";
    }

    @Override
    public void buildMemory() {
        computer.memory = 8;
    }

    @Override
    public void buildStorage() {
        computer.storage = 512;
    }

    @Override
    public ElectronicDevice getResult() {
        return computer;
    }
}
