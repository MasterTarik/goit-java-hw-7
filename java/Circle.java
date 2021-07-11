import interfacec.Area;

public class Circle extends GraphicsEditor implements Area {

    @Override
    public void getName() {
        System.out.println("Circle");
    }

    @Override
    public double area(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

}
