package oo;
public class Point {
    private double x;
    private double y;
    
    // Default constructor
    public Point() {}

    // Overload constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //APIs Applicatin Programming Interface
    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public float getDistance(Point p) {
        double xd = this.x - p.x;
        double yd = this.y - p.y;
        return (float) Math.sqrt(xd * xd + yd * yd);
    }

    // annotation
    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }
}
