public class Point extends Shape{
    public Point(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    double getArea() {
        return 0;
    }
}
