import interfacec.Print;

public class Rhombus extends Shape implements Print {

    @Override
    public final String getName() {
        return "Rhombus";
    }

    @Override
    public void printShapeName() {
        System.out.printf("This shape name will be : %s%n", getName());
    }
}
