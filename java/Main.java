import interfacec.Area;

public class Main {
    public static void main(String[] args) {
        GraphicsEditor oval = new Oval();
        GraphicsEditor circle = new Circle();
        GraphicsEditor rectangle = new Rectangle();
        GraphicsEditor triangle = new Triangle();
        GraphicsEditor rhombus = new Rhombus();
        oval.getName();
        circle.getName();
        rectangle.getName();
        triangle.getName();
        rhombus.getName();
    }
}
