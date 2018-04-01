package structures;

public class Edge implements Moveable {

    private Point a;
    private Point b;

    public Edge(Point a, Point b) {
        this.a = new Point(a);
        this.b = new Point(b);
    }

    @Override
    public void translate(long xt, long yt) {
        a.translate(xt, yt);
        b.translate(xt, yt);
    }

    @Override
    public String toString() {
        return a.toString() + " " + b.toString() + ",";
    }
}
