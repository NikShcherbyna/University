abstract class Shape {
    private int x;
    protected int y;
    public String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    abstract double getArea();
}
