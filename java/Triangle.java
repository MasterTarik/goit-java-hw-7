import interfacec.Print;

public class Triangle extends Shape implements Print {

    @Override
    public final String getName() {
        return "Triangle";
    }

    @Override
    public void printShapeName() {
        System.out.printf("This shape name will be : %s%n", getName());
    }
}
