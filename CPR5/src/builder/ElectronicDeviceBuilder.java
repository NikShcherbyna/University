package builder;

import devices.ElectronicDevice;

public interface ElectronicDeviceBuilder {
    void buildProcessor();
    void buildMemory();
    void buildStorage();
    ElectronicDevice getResult();
}
