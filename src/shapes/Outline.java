package shapes;

import structures.Edge;
import structures.Point;

import java.util.ArrayList;
import java.util.List;

import static structures.Square.SIZE;
import static util.Orientation.HORIZONTAL;
import static util.Orientation.VERTICAL;

public class Outline extends Shape {

    public Outline(boolean black) {
        super(black);
    }

    @Override
    public List<Edge> build(Point origin) {
        List<Edge> edges = new ArrayList<>();
        edges.add(VERTICAL.createEdge(origin));
        edges.add(HORIZONTAL.createEdge(origin));
        Point p1 = new Point(origin, 0, SIZE);
        edges.add(HORIZONTAL.createEdge(p1));
        Point p2 = new Point(origin, SIZE, 0);
        edges.add(VERTICAL.createEdge(p2));
        return edges;
    }
}
