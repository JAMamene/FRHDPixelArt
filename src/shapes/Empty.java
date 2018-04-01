package shapes;

import structures.Edge;
import structures.Point;

import java.util.ArrayList;
import java.util.List;

public class Empty extends Shape {

    public Empty(boolean black) {
        super(black);
    }

    @Override
    public List<Edge> build(Point origin) {
        return new ArrayList<Edge>();
    }
}
