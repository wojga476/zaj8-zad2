public class Circle extends GeometricShape {
    private double r1;

    public Circle(int x1, int y1, double r1) {
        super(x1, y1);
        this.r1 = r1;
    }

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }
}