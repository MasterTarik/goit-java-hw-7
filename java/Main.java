public class Main {
    public static void main(String[] args) {


        /**********************Circle****************************/
        Circle circle = new Circle(3);
        System.out.println("Shape name " + circle.getShapeName() + "with radius " + circle.getRadius());
        System.out.println("area = " + circle.area());
        System.out.println("length =" + circle.length());
        System.out.println("diameter =" + circle.diameter());
        /**********************Oval******************************/
        Oval oval = new Oval(3, 7);
        System.out.println(oval.getShapeName());


        /**********************Triangle******************************/
        Triangle triangle = new Triangle(3, 7, 11);
        System.out.println("Shape name " +  triangle.getShapeName());
        System.out.printf(" whi side a = %f, b = %f, c = %f%n", triangle.getaSide(), triangle.getbSide(), triangle.getcSide());

        /**********************Quad******************************/
        Shape quad = new Quad(9);
        System.out.printf("Shape name is: %s%n" + "side = %d%n", quad.getShapeName());
        Quad quad1 = new Quad(7);
        System.out.printf("Shape name is: %s%n" + "side = %d%n", quad1.getShapeName());
        System.out.printf("Side is %d%n", quad1.getSide());
        System.out.printf("Area = %f%n", quad1.area());
        /**********************Rectangle******************************/
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle.getShapeName());

        /**********************Parallelogram**********************/
        Parallelogram parallelogram = new Parallelogram(2, 5, 12, 18);
        System.out.printf("Shape name = %s%n", parallelogram.getShapeName());
        /**********************Rhombus******************************/
        Rhombus rhombus = new Rhombus(3, 4);
        System.out.println(rhombus.getShapeName());


    }

}
