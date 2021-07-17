import interfacec.Area;

public class Main {
    public static void main(String[] args) {
        Oval oval = new Oval();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Rhombus rhombus = new Rhombus();

        System.out.println(oval.getName());
        System.out.println(circle.getName());
        System.out.println(rectangle.getName());
        System.out.println(triangle.getName());
        System.out.println(rhombus.getName());
    }
}
