package util;

import structures.Edge;
import structures.Point;

import static structures.Square.SIZE;

public enum Orientation {
    VERTICAL {
        @Override
        public Edge createEdge(Point origin) {
            return new Edge(origin, new Point(origin.getX(), origin.getY() + SIZE));
        }
    }, HORIZONTAL {
        @Override
        public Edge createEdge(Point origin) {
            return new Edge(origin, new Point(origin.getX() + SIZE, origin.getY()));
        }
    }, DESCENDING {
        @Override
        public Edge createEdge(Point origin) {
            return new Edge(origin, new Point(origin.getX() + SIZE, origin.getY() + SIZE));
        }
    }, ASCENDING {
        @Override
        public Edge createEdge(Point origin) {
            return new Edge(origin, new Point(origin.getX() + SIZE, origin.getY() - SIZE));
        }
    };

    public abstract Edge createEdge(Point origin);
}
