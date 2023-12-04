public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String name, int numberOfSeats) {
        super(name);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void move() {
        System.out.println(name + " is moving on the road with " + numberOfSeats + " seats.");
    }
}
