public class Ball extends Shape3D{
    private int r;

    public Ball(int x1, int y1, int z1, int r) {
        super(x1, y1, z1);
        r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {

        r = r;
    }
}