public class Obstacle {
private int h;
private int d;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Obstacle(int h, int d) {
        this.h = h;
        this.d = d;
    }

    @Override
    public String toString() {
        return "дистанция{" +
                "h=" + h +
                ", d=" + d +
                '}';
    }

}
