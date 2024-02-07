package oo;
import java.util.Map;
import java.util.HashMap;
public class ShapeTest {
    public static void main(String[] args) {
        // Points
        Point o = new Point(0, 0);
        Point a = new Point(1.0, 2.0);   
        Point b = new Point(2.2, 3.6);
       
        System.out.println(o);
        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getDistance(o));
        System.out.println(a.getDistance(b));

        // Rectangle
        Rectangle r = new Rectangle(a, 2.1, 1.8);
        System.out.printf("Length: % .2f\n", r.getLength());
        System.out.printf("Width: % .2f\n", r.getWidth());
        System.out.println(r);
        System.out.println(r.diagonal());
        System.out.printf("Diagonal: % .2f\n", r.diagonal());
        System.out.printf("Perimeter: % .2f\n", r.perimeter());
        System.out.printf("Area: % .2f\n", r.area());
        System.out.println("Is square: " + r.isSquare());

        System.out.println(r.contains(o));
        System.out.println(r.contains(new Point(1.5, 3.0)));

        // Square
        Square sq = new Square(a, 5);
        System.out.println(new Square());
        System.out.println(sq);
        System.out.printf("Side: % .2f\n", sq.getSide());
        System.out.printf("Area: % .2f\n", sq.area());
        System.out.printf("Diagonal: % .2f\n", sq.diagonal());
        System.out.println(sq.contains(o));
        System.out.println(sq.contains(new Point (2, 3)));
        System.out.println("Is square: " + sq.isSquare());

        // Circle
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.getName());
        Circle circle2 = new Circle(a, 2.0);
        System.out.println(circle2);
        System.out.printf("Circle Area: %.2f\n", circle2.area());
        System.out.printf("Circle perimeter: %.2f\n", circle2.perimeter());

        // Circle contains
        System.out.println(circle2.contains(o));
        System.out.println(circle2.contains(new Point(1.0, 2.0)));
        System.out.println(circle.contains(new Point(0.9, 0.9)));

        // Line
        Line line = new Line(a, b);
        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Midpoint: " + line.getMid());

        // Triangle 
        Triangle triangle = new Triangle(new Point(), new Point(0, 1), new Point(1, 0));
        System.out.println(triangle);
        System.out.printf("Perimeter: % .2f\n", triangle.perimeter());
        System.out.printf("Area: % .2f\n", triangle.area());
        System.out.println(triangle.contains(new Point(1, 1)));
        System.out.println(triangle.contains(new Point(0.3, 0.3)));
        System.out.println("Is equilateral: " + triangle.isEquilateral());

        // Equilateral Triangle
        EquilateralTriangle etriangle = new EquilateralTriangle();
        System.out.println(etriangle);
        System.out.println("Perimeter: " + etriangle.perimeter());
        System.out.println("Area: " + etriangle.area());
        System.out.println(etriangle.contains(a));
        System.out.println(etriangle.contains(o));
        System.out.println("Is equilateral: " + etriangle.isEquilateral());

        // Triangular prism
        TriangularPrism triPrism = new TriangularPrism(etriangle, r);
        System.out.println(triPrism);

        // Polymorphism
        System.out.println();
        int n = 6;
        Shape shapes[] = new Shape[n];
        shapes[0] = r;
        shapes[1] = sq;
        shapes[2] = circle;
        shapes[3] = triangle;
        shapes[4] = etriangle;
        shapes[5] = triPrism;

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Perimeter: % .2f\n", shape.perimeter());
            System.out.printf("Area: % .2f\n", shape.area());
            System.out.println("Contains: " + shape.contains(o));
        }

        // ShapeFactory (factory design pattern)
        System.out.println();
        System.out.println("ShapeFactory: ");
        ShapeFactory factory = ShapeFactory.instance();
        n = Shape.Type.values().length;
        Shape shapes2[] = new Shape[n];
        for(int i = 0; i < n; i++)
            shapes2[i] = factory.create(Shape.Type.values()[i]);

        for (Shape shape : shapes2) {
            System.out.println(shape);
        }

        Shape shapes3[] = new Shape[6];
        shapes3[0] = factory.create(Shape.Type.CIRCLE, a, 2.1);
        shapes3[1] = factory.create(Shape.Type.RECTANGLE, a, 1.1, 3.6);
        shapes3[2] = factory.create(Shape.Type.SQUARE, a, 6.2);
        shapes3[3] = factory.create(Shape.Type.TRIANGLE, o, a, b);
        shapes3[4] = factory.create(Shape.Type.EQUILATERAL_TRIANGLE, a, 11.2);
        shapes3[5] = factory.create(Shape.Type.TRIANGULAR_PRISM, etriangle, r);

        System.out.println("______");
        for (Shape shape : shapes3) {
            System.out.println(shape);
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
            System.out.println(shape.contains(o));
        }

        // Map
        Map <String, Point> points = new HashMap < String, Point>();
        points.put("o", o);
        points.put("a", a);
        points.put("b", b);
        points.put("Antoinne", new Point(-3.0, 26));
        points.put("Antoinne", new Point (-6.0, 100));

        Point point = points.get("o");
        System.out.println(point);
        System.out.println(points.get("b"));
        System.out.println(points.get("Antoinne"));
        System.out.println(points.get("Antoinne").getDistance(o));

        System.out.println(points);

        points.remove("b");
        System.out.println();
        points.forEach((k, v)
            -> System.out.printf("key: %s, value: %s\n", k, v));

        System.out.println();
        Map<String, Shape> ss = new HashMap <String, Shape>();
        ss.put("shape", r);
        System.out.println(ss.get("shape"));
    }
}
