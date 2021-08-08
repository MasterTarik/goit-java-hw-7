import interfaces.ShapeOperation;
import interfaces.Square;

public class Triangle extends Shape implements Square, ShapeOperation {
    private final String name = "Triangle";

    private double a, b, c;

    public Triangle(double aSide, double bSide, double cSide) {
        this.a = aSide;
        this.b = bSide;
        this.c = cSide;
    }

    @Override
    public final String getShapeName() {
        return name;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return  a + b + c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
