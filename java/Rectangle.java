import interfaces.Circle;
import interfaces.ShapeOperation;
import interfaces.Square;

public class Rectangle extends Shape implements Square, ShapeOperation {

    public final String name = "Rectangle";
    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public double area() {
        return aSide * bSide;
    }

    @Override
    public double diameter() {
        return Math.sqrt(Math.pow(aSide, 2) + Math.pow(bSide, 2));
    }

    @Override
    public double perimeter() {
        return 2 * (aSide + bSide);
    }

    @Override
    public String getShapeName() {
        return name;
    }
}
