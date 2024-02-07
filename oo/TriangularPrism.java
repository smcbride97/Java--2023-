package oo;

public class TriangularPrism extends AbstractShape {
    private EquilateralTriangle sideTriangle;
    private Rectangle sideRectangle;

    public TriangularPrism() {
        this(new EquilateralTriangle(), new Rectangle());
    }

    public TriangularPrism(EquilateralTriangle sideTriangle, Rectangle sideRectangle) {
        this.sideTriangle = sideTriangle;
        this.sideRectangle = sideRectangle;
        this.name = Shape.Type.TRIANGULAR_PRISM;
    }

    @Override
    public double perimeter() {
        return  (2 * this.sideTriangle.perimeter()) + (3 * this.sideRectangle.getLength());
    }

    @Override
    public float area() {
        return (float) (3 * this.sideRectangle.area()) + (2 * this.sideTriangle.area());
    }

    @Override
    public boolean contains(Point p) {
        // dummy implementation
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s: surface area = %.2f", this.getClass().getName(), this.area());
    }
}
