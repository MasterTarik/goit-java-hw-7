import interfaces.Circle;
import interfaces.ShapeOperation;

public class Oval extends Shape implements Circle, ShapeOperation {

    private double radiusLow;
    private double radiusHeight;
    public final String name = "Oval";

    public Oval(double radiusLow, double radiusHeight) {
        this.radiusLow = radiusLow;
        this.radiusHeight = radiusHeight;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double length() {
        return Pi * (radiusLow + radiusHeight);
    }

    @Override
    public double area() {
        return Pi * radiusLow * radiusHeight;
    }

    @Override
    public double diagonal() {
        return 0;
    }
}
