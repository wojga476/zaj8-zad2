public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        double wynik = 0;
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            wynik = Math.PI * Math.pow(circle.getR1(), 2);

        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            wynik = (rectangle.getY2() - rectangle.getY1()) * (rectangle.getX3() - rectangle.getX2());
        }
        return wynik;
    }

    @Override
    public double volume(Shape3D shape) {
        double wynik = 0;
        if (shape instanceof Ball) {
            Ball ball = (Ball) shape;
            wynik = (Math.pow(ball.getR(), 3)) * Math.PI * 4.0 / 3.0;
        } else if (shape instanceof Cube) {
            Cube cube = (Cube) shape;
            wynik = Math.pow(cube.getY2() - cube.getX2(), 3);
        }
        return wynik;
    }

    public void obliczanieWyswietlanie(Shape shape) {
        if (shape instanceof Line2D) {
            Line2D line = (Line2D) shape;
            System.out.printf("Linia łącząca punkty [%d,%d][%d,%d] ma długość %.3f%n", line.getX1(), line.getY1(), line.getX2(), line.getY2(), lineLength(line));
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.printf("Prostokąt o bokach %d i %d ma pole %.3f%n", rectangle.getY2() - rectangle.getY1(), rectangle.getX3() - rectangle.getX2(), shapeArea(rectangle));
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.printf("Okrąg o promieniu %.2f ma pole %.3f%n", circle.getR1(), shapeArea(circle));
        } else if (shape instanceof Ball) {
            Ball ball = (Ball) shape;
            System.out.printf("Kula o promieniu %.2f ma objetość %.3f%n", ball.getR(), volume(ball));
        } else if (shape instanceof Cube) {
            Cube cube = (Cube) shape;
            System.out.printf("Sześcian o długości boku %d ma objetość %.3f%n", cube.getY2() - cube.getX2(), volume(cube));
        }
    }


}

