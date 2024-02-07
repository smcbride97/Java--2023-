package oo;

public class Circle extends AbstractShape {
    private Point center;
    private double radius;

    public Circle() {
        this(new Point(), 1);
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        this.name = Shape.Type.CIRCLE;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public float area() {
        return (float) (Math.PI * (this.radius * this.radius));
    }

    @Override
    public boolean contains(Point p) {
        return this.center.getDistance(p) < this.radius;
    }


    public String toString() {
        return this.getClass().getName() +": " + center + ", " + this.radius;
    }
}
