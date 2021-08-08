import interfaces.Circle;
import interfaces.ShapeOperation;
import interfaces.Square;

public class Triangle extends Shape implements Square, ShapeOperation {
    private final String name = "Triangle";

    private double aSide, bSide, cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public final String getShapeName() {
        return name;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double diameter() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public double getaSide() {
        return aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public double getcSide() {
        return cSide;
    }
}
