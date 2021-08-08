import interfaces.Circle;

public class Oval extends Shape implements Circle {

    private final double radiusLow;
    private final double radiusHeight;
    public static final String name = "Oval";

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
