public class Main {
    public static void main(String[] args) {


        /**********************Circle****************************/
        Circle circle = new Circle(3);
        System.out.println("Shape name " + circle.getShapeName() + "with radius " + circle.getRadius());
        System.out.println("area = " + circle.area());
        System.out.println("length =" + circle.length());
        System.out.println("diameter =" + circle.diagonal());

        /**********************Oval******************************/
        Oval oval = new Oval(3, 7);
        System.out.println("Shape name " + oval.getShapeName());
        System.out.printf("area = %f%n", oval.area());
        System.out.printf("diagonal %f%n", oval.diagonal());


        /**********************Triangle******************************/
        Triangle triangle = new Triangle(3, 7, 11);
        System.out.println("Shape name " + triangle.getShapeName());
        System.out.printf(" whi side a = %f, b = %f, c = %f%n", triangle.getA(), triangle.getB(), triangle.getC());
        System.out.printf("area = %f%n" + "perimeter = %f%n", triangle.area(), triangle.perimeter());

        /**********************Quad******************************/
        Quad quad1 = new Quad(7);
        System.out.printf("Shape name is: %s%n" + " side = %f", quad1.getShapeName(), quad1.getSide());
        System.out.printf("Area = %f%n", quad1.area());
        System.out.printf("Diagonal = %f%n", quad1.diagonal());

        /**********************Parallelogram**********************/
        Parallelogram parallelogram = new Parallelogram(2, 5, 12, 18);
        System.out.printf("Shape name = %s%n", parallelogram.getShapeName());
        /**********************Rhombus******************************/
        Rhombus rhombus = new Rhombus(3, 4);
        System.out.println(rhombus.getShapeName());
    }

}
