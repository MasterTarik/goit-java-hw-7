import interfaces.Circle;
import interfaces.ShapeOperation;
import interfaces.Square;

public class Rhombus extends Shape implements Square, ShapeOperation {

    private final String name = "Rhombus";

    private double aSide, bSide;

    public Rhombus(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
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
}
