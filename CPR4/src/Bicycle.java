public class Bicycle extends Vehicle{

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is moving on the bicycle path.");
    }
}
