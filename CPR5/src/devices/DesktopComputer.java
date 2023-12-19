package devices;


public class DesktopComputer extends ElectronicDevice {
    private String caseType;

    public DesktopComputer(String processor, int memory, int storage, String caseType) {
        super(processor, memory, storage);
        this.caseType = caseType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Desktop Computer - Processor: " + processor +
                ", Memory: " + memory + "GB, Storage: " + storage + "GB, Case Type: " + caseType);
    }
}
