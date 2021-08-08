import interfaces.ShapeOperation;
import interfaces.Square;

public class Quad extends Shape implements Square, ShapeOperation {
    private int side;

    public Quad(int side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Quad";
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double diameter() {
        return Math.sqrt(2) * side;
    }

    public int getSide() {
        return side;
    }
}
