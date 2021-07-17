import interfacec.Print;

public class Oval extends Shape implements Print {

    @Override
    public final String getName() {
        return "Oval";
    }

    @Override
    public void printShapeName() {
        System.out.printf("This shape name will be : %s%n", getName());
    }
}
