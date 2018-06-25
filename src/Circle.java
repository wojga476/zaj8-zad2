public class Circle extends GeometricShape {
    private double promien1;

    public Circle(int x1, int y1, double promien1) {
        super(x1, y1);
        this.promien1 = promien1;
    }

    public double getPromien1() {
        return promien1;
    }

    public void setPromien1(double promien1) {
        this.promien1 = promien1;
    }
}