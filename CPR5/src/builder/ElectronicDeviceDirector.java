package builder;

import devices.ElectronicDevice;

public class ElectronicDeviceDirector {
    public ElectronicDevice buildElectronicDevice(ElectronicDeviceBuilder builder) {
        builder.buildProcessor();
        builder.buildMemory();
        builder.buildStorage();
        if (builder instanceof SmartphoneBuilder) {
            ((SmartphoneBuilder) builder).buildOperatingSystem();
        }
        return builder.getResult();
    }
}

