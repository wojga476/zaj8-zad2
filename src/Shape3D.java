public abstract class Shape3D extends Shape  {
    private int z1;

    public int getZ1() {
        return z1;
    }
    public void setZ1(int z1) {
        this.z1 = z1;
    }
    public Shape3D(int x1, int y1, int z1) {

        super(x1, y1);
        this.z1 = z1;

    }
}
