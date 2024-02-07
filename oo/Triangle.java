package oo;

public class Triangle extends AbstractShape {
    private Point p1, p2, p3;
    private double a, b, c;

    public Triangle(){
        super(Shape.Type.TRIANGLE);
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        this.a = p1.getDistance(p2);
        this.b = p1.getDistance(p3);
        this.c = p2.getDistance(p3);
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public float area() {
        double s = ((a + b + c) / 2);

        // Don't use double since it gives precision error; use float instead
        return (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public boolean contains(Point p) {
        double ta = this.area();
        Triangle t1 = new Triangle(p, p1, p2);
        Triangle t2 = new Triangle(p, p1, p3);
        Triangle t3 = new Triangle(p, p2, p3);

        return (ta == t1.area() + t2.area() + t3.area());
    }

    public boolean isEquilateral() {
        return (p1.getDistance(p2) == p1.getDistance(p3) && p1.getDistance(p3) == p2.getDistance(p3));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " + p1 + ", " + p2 + ", " + p3;
    }
}
