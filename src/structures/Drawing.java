package structures;

import shapes.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static structures.Square.SIZE;

public class Drawing implements Moveable {

    private static final NavigableMap<Integer, Shape> map = new TreeMap<Integer, Shape>();

    static {
        map.put(0, new Full(true));
        map.put(40, new AlmostFull(true));
        map.put(80, new Cross(true));
        map.put(120, new Full(false));
        map.put(160, new AlmostFull(false));
        map.put(200, new Outline(false));
        map.put(240, new AlmostEmpty(false));
        map.put(255, new Empty(false));
    }

    private List<Square> squares;

    public Drawing(Point origin, String BMPFileName) throws IOException {
        BufferedImage image = ImageIO.read(getClass().getResource("/" + BMPFileName));
        squares = new ArrayList<>();
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int color = image.getRGB(x, y);
                int r = (color >> 16) & 0xff;
                int g = (color >> 8) & 0xff;
                int b = color & 0xff;
                int avg = (r + g + b) / 3;
                squares.add(new Square(new Point(x * SIZE, y * SIZE), map.floorEntry(avg).getValue()));
            }
        }
        translate(origin.getX(), origin.getY());
    }


    @Override
    public void translate(long xt, long yt) {
        for (Square s : squares) {
            s.translate(xt, yt);
        }
    }

    public List<Square> getSquares(boolean black) {
        if (black) {
            return squares.stream().filter(Square::isBlack).collect(Collectors.toList());
        } else {
            return squares.stream().filter(square -> !square.isBlack()).collect(Collectors.toList());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (Square s : getSquares(true)) {
            sb.append(s);
        }
        sb.append("#");
        for (Square s : getSquares(false)) {
            sb.append(s);
        }
        sb.append("#");
        return sb.toString();
    }
}

