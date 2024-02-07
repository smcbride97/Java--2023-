package oo;

public class Rectangle extends AbstractShape {
    private Point p;
    private double length;
    private double width;

    Rectangle() {
        this(new Point(), 1, 1);
    }

    Rectangle(Point p, double length, double width) {
        this.p = p;
        this.length = length;
        this.width = width;
        this.name = Shape.Type.RECTANGLE;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double diagonal() {
        return Math.sqrt((this.getWidth() * this.getWidth()) + (this.getLength() * this.getLength()));
    }

    public boolean isSquare() {
        /*if (this.width == this.length) return true;
        return false;*/
        return (this.width == this.length);
    }

    @Override
    public double perimeter() {
        return 2*(this.width + this.length);
    }

    @Override
    public float area() {
        return (float) (this.getWidth() * this.getLength());
    }

    @Override
    public boolean contains(Point p) {
        return (p.getX() > this.p.getX()) && (p.getX() < this.p.getX() + this.length) && (p.getY() > this.p.getY()) && (p.getY() < this.p.getY() + this.width);
    }

    @Override
    public String toString() {
        return String.format("%s: %s, length = %.2f, width = %.2f", this.getClass().getName(), this.p, this.length, this.width);
    } 
}
