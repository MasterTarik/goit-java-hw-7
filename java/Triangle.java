
public class Triangle extends Shape implements interfaces.Triangle {
    private static final String name = "Triangle";

    private final double a;
    private final double b;
    private final double c;

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
        return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public double perimeter() {
        return a + b + c;
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
