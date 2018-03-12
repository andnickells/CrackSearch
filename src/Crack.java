// Crack Search Project
// Andrew Nickells
// 201123012
// u5an
// A.P.Nickells@student.liverpool.ac.uk
// University of Liverpool

import util.Point;

/**
 * Crack Object
 *
 * Contains all data associated with a crack. Geometric data is stored as a list of points.
 *
 * The class acts almost as an interface between the GUI and the logic of the program.
 */
public class Crack {

    public final static int MAX_POINTS = 500;

    private Point[] points;
    private int length;

    public Crack() {

    }

    public Crack(Point[] points, int length) {
        this.points = points;
        this.length = length;
    }

    public Point getPoint(int index) {
        return points[index];
    }

    public int getLength() {
        return length;
    }

    public int numPoints() {
        return points.length;
    }
}