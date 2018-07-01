public abstract class Shape3D extends Shape  {
    private int x1;
    private int y1;
    private int z1;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getZ1() {
        return z1;
    }

    public void setZ1(int z1) {
        this.z1 = z1;
    }

    public Shape3D(int x1, int y1, int z1) {

        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
    }
}
