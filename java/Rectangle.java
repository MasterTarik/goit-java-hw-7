import interfacec.Print;

public class Rectangle extends Shape implements Print {

    @Override
    public final String getName() {
        return "Rectangle";
    }

    @Override
    public void printShapeName() {
        System.out.printf("This shape name will be : %s%n", getName());
    }
}
