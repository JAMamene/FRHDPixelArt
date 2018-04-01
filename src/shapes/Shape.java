package shapes;

import structures.Edge;
import structures.Point;

import java.util.List;

public abstract class Shape {

    public boolean black;

    public Shape(boolean black) {
        this.black = black;
    }

    public boolean isBlack() {
        return black;
    }

    public abstract List<Edge> build(Point origin);

}
