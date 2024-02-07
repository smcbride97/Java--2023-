package oo;

public class ShapeFactory {
    // Singleton factory
    private static ShapeFactory instance = new ShapeFactory();

    private ShapeFactory(){};

    public static ShapeFactory instance() {
        return instance;
    }

    public Shape create(Shape.Type shapeType) {     
        switch(shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case EQUILATERAL_TRIANGLE:
                return new EquilateralTriangle();
            case TRIANGULAR_PRISM:
                return new TriangularPrism();
        }
        return null;
    }

    //Generic variable args
    public Shape create(Shape.Type shapeType, Object ... x) {
        switch(shapeType) {
            case CIRCLE:
                return new Circle((Point)x[0], (double)x[1]);
            case RECTANGLE:
                return new Rectangle((Point)x[0], (double)x[1], (double)x[2]);
            case SQUARE:
                return new Square((Point)x[0], (double)x[1]);
            case TRIANGLE:
                return new Triangle((Point)x[0], (Point)x[1], (Point)x[2]);
            case EQUILATERAL_TRIANGLE:
                return new EquilateralTriangle((Point)x[0], (double)x[1]);
            case TRIANGULAR_PRISM:
                return new TriangularPrism((EquilateralTriangle)x[0], (Rectangle)x[1]);
        }
        return null;
    }
}
