import interfaces.ShapeOperation;

public class Circle extends Shape implements interfaces.Circle, ShapeOperation {

    public static final String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double area() {
        return Pi * radius * radius;
    }

    @Override
    public double diagonal() {
        return 2 * radius;
    }

    @Override
    public double length() {
        return 2 * Pi * radius;
    }

    public double getRadius() {
        return radius;
    }
}
