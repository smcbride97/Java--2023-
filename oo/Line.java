package oo;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double getLength() {
        return a.getDistance(b);
    }

    public Point getMid() {
        double x = (a.getX() + b.getX()) / 2;
        double y = (a.getY() + b.getY()) / 2;
        return new Point(x, y);
    }
    @Override
    public String toString() {
        return this.getClass().getName() + " Line points: " + a + ", " + b;
    }
}
