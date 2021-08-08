import interfaces.ShapeOperation;
import interfaces.Square;

public class Parallelogram extends Shape implements Square, ShapeOperation {

    private final String name = "Parallelogram";
    private double aSide = 0;
    private double bSide = 0;
    private double alphaAngle = 0;
    private double betaAngle = 0;



    public Parallelogram(double aSide, double bSide, double alphaAngle, double betaAngle) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.alphaAngle = alphaAngle;
        this.betaAngle = betaAngle;
    }

    @Override
    public double perimeter() {
        return 2 * (aSide + bSide);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double area() {
        return aSide * bSide * Math.sin(betaAngle);
    }

    @Override
    public double diameter() {
        return Math.sqrt(Math.pow(aSide, 2) + Math.pow(bSide, 2)  - 2*aSide*bSide * Math.cos(betaAngle));
    }

    public double getaSide() {
        return aSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    public double getAlphaAngle() {
        return alphaAngle;
    }

    public void setAlphaAngle(double alphaAngle) {
        this.alphaAngle = alphaAngle;
    }

    public double getBetaAngle() {
        return betaAngle;
    }

    public void setBetaAngle(double betaAngle) {
        this.betaAngle = betaAngle;
    }
}
