import interfacec.Print;

public class Parallelogram extends Shape implements Print {

    @Override
    public final String getName() {
        return "Parallelogram";
    }

    @Override
    public void printShapeName() {
        System.out.printf("This shape name will be : %s%n", getName());
    }
}
