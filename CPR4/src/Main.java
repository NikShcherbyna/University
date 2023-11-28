public class Main {
    public static void main(String[] args) {
        final int numberOfTransportVehicles = 3;
        Vehicle[] transport = new Vehicle[numberOfTransportVehicles];

        transport[0] = new Car("Audi", 5);
        transport[1] = new Bicycle("BMX");
        transport[2] = new Car("Mercedes", 7);

        for (int i = 0; i < numberOfTransportVehicles; ++i) {
            transport[i].move();
        }
    }
}
