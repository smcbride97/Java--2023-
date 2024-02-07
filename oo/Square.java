package oo;

public class Square extends Rectangle {
    private Point a;
    private double side;

    public Square() {
        this(new Point(), 2);
    }

    public Square(Point a, double side) {
        super(a, side, side);
        this.side = side;
        this.a = a;
        this.name = Shape.Type.SQUARE;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public String toString() {
        return String.format("%s: %s, side: = %.2f", this.getClass().getName(), this.a, this.side);
    }
}
