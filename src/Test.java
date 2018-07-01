public class Test {
    public static void main(String[] args) {
        ShapeCalculator kalkulator = new ShapeCalculator();
        Ball ball1 = new Ball(1,4,1,5);
        Rectangle rectangle = new Rectangle(3,1,2,4,4,5,6,4);
        Circle circle = new Circle(1,1,10);
        Cube cube = new Cube(2,1,1,2,8,2,3,4,3,4,5,4,5,5,5,6,6,6,7,7,7,8,8,8);
        Line2D line = new Line2D(1,6,4,3);
        Shape[] shapes = new Shape[]{ball1, circle, rectangle, line, cube };
        for (Shape shape: shapes){
            kalkulator.obliczanieWyswietlanie(shape);
        }
    }
}