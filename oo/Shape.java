package oo;

public interface Shape {
    double perimeter();
    float area();
    boolean contains(Point p);

    enum Type {
        NONE, CIRCLE, TRIANGLE, RECTANGLE, SQUARE, EQUILATERAL_TRIANGLE, TRIANGULAR_PRISM;
    }
}
