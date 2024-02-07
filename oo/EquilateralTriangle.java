package oo;

public class EquilateralTriangle extends Triangle {
    private Point a;
    private double side;

    public EquilateralTriangle() {
        this(new Point(), 1);
    }

    public EquilateralTriangle(Point a, double side) {
        super(a, new Point(a.getX() + side, a.getY()), new Point(a.getX() +side/2, Math.sqrt(3) * side/2 + a.getY()));
        this.side = side;
        this.a = a;
        this.name = Shape.Type.EQUILATERAL_TRIANGLE;
    }

    public double height() {
        return Math.sqrt(3) * this.side/2;
    }

    @Override
    public String toString() {
        return String.format("%s: %s, side = %.2f, height = %.2f", this.getClass().getName(), this.a, this.side, this.height());
    }
}
