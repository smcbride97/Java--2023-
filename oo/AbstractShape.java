package oo;

public abstract class AbstractShape implements Shape {
    protected Shape.Type name;

    public AbstractShape() {
        this.name = Shape.Type.NONE;
    }

    public AbstractShape(Shape.Type name) {
        this.name = name;
    }

    public final Shape.Type getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return AbstractShape.class.getName();
    }
    
}
