package devices;

public abstract class ElectronicDevice {
        public String processor;
        public int memory;
        public int storage;

        public ElectronicDevice(String processor, int memory, int storage) {
            this.processor = processor;
            this.memory = memory;
            this.storage = storage;
        }

        public abstract void displayInfo();
    }

