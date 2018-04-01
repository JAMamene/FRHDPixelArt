package structures;

import shapes.Shape;

import java.util.List;

public class Square implements Moveable {

    public static final int SIZE = 10;

    private List<Edge> edges;
    private boolean black;

    public Square(Point origin, Shape shape) {
        edges = shape.build(origin);
        black = shape.isBlack();
    }

    @Override
    public void translate(long xt, long yt) {
        for (Edge e : edges) {
            e.translate(xt, yt);
        }
    }

    public boolean isBlack() {
        return black;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (Edge e : edges) {
            sb.append(e);
        }
        return sb.toString();
    }
}
