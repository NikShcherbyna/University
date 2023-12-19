package builder;

import builder.ElectronicDeviceBuilder;
import devices.DesktopComputer;
import devices.ElectronicDevice;

public class DesktopComputerBuilder implements ElectronicDeviceBuilder {
    private DesktopComputer computer;

    public DesktopComputerBuilder() {
        this.computer = new DesktopComputer("", 0, 0, "");
    }

    @Override
    public void buildProcessor() {
        computer.processor = "Intel Core i7";
    }

    @Override
    public void buildMemory() {
        computer.memory = 16;
    }

    @Override
    public void buildStorage() {
        computer.storage = 1000;
    }

    @Override
    public ElectronicDevice getResult() {
        return computer;
    }
}
