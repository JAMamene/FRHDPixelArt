package shapes;

import structures.Edge;
import structures.Point;

import java.util.ArrayList;
import java.util.List;

import static structures.Square.SIZE;
import static util.Orientation.ASCENDING;
import static util.Orientation.DESCENDING;

public class Cross extends Shape {
    public Cross(boolean b) {
        super(b);
    }

    @Override
    public List<Edge> build(Point origin) {
        List<Edge> edges = new ArrayList<>();
        edges.add(DESCENDING.createEdge(origin));
        Point p1 = new Point(origin, 0, SIZE);
        edges.add(ASCENDING.createEdge(p1));
        return edges;
    }
}
