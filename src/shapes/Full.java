package shapes;

import structures.Edge;
import structures.Point;

import java.util.ArrayList;
import java.util.List;

import static structures.Square.SIZE;
import static util.Orientation.*;

public class Full extends Shape {

    public Full(boolean black) {
        super(black);
    }

    @Override
    public List<Edge> build(Point origin) {
        List<Edge> edges = new ArrayList<>();
        edges.add(VERTICAL.createEdge(origin));
        edges.add(HORIZONTAL.createEdge(origin));
        edges.add(DESCENDING.createEdge(origin));
        Point p1 = new Point(origin, 0, SIZE);
        edges.add(HORIZONTAL.createEdge(p1));
        edges.add(ASCENDING.createEdge(p1));
        Point p2 = new Point(origin, SIZE, 0);
        edges.add(VERTICAL.createEdge(p2));
        return edges;
    }
}
