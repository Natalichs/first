public class Member implements Go{
    private String name;
    private int height;
    private int distance;

    public Member(Member m) {
        this.name = m.name;
        this.height= m.height;
        this.distance= m.distance;
    }

    @Override
    public boolean run(int d) {
        return this.distance>=d;
    }

    @Override
    public boolean jump(int h) {
        return this.height>=h;
    }

    public Member(String name, int height, int distance) {
        this.name = name;
        this.height = height;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", distance=" + distance +
                '}';
    }

}
