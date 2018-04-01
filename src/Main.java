import structures.Drawing;
import structures.Point;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        Drawing pouet;
        try {
            pouet = new Drawing(new Point(0, 0), "pepe.bmp");
            PrintWriter writer = new PrintWriter("track.txt", "UTF-8");
            writer.print(pouet);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
