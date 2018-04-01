package shapes;

import structures.Edge;
import structures.Point;

import java.util.Collections;
import java.util.List;

import static util.Orientation.DESCENDING;

public class AlmostEmpty extends Shape {

    public AlmostEmpty(boolean black) {
        super(black);
    }

    @Override
    public List<Edge> build(Point origin) {
        return Collections.singletonList(DESCENDING.createEdge(origin));
    }
}
