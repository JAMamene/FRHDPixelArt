package structures;

import util.Base32;

public class Point implements Moveable {

    private long x;
    private long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point(Point p, long x, long y) {
        this.x = p.x + x;
        this.y = p.y + y;
    }

    @Override
    public void translate(long xt, long yt) {
        this.x += xt;
        this.y += yt;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    @Override
    public String toString() {
        return Base32.encode(x) + " " + Base32.encode(y);
    }
}
