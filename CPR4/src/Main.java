public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(1, 2, "Blue", 5, 10);
        shapes[1] = new Circle(3, 4, "Red", 7);
        shapes[2] = new Point(0, 0, "Green");

        // Виклик методів для яких реалізований принцип поліморфізму
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}