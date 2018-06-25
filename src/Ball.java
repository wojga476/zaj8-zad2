public class Ball extends Shape3D{
    private int promien;

    public Ball(int x1, int y1, int z1, int promien) {
        super(x1, y1, z1);
        promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(int promien) {

        promien = promien;
    }
}