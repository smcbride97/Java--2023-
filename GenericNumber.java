// Bounded generic types
public class GenericNumber<T extends Number> {
    T number;

    GenericNumber(T number) {
        this.number = number;
    }

    double reciprocal() {
        return 1 / number.doubleValue();
    }

    //boolean absEqual(GenericNumber<T> number2)
    boolean absEqual(GenericNumber<?> number2) { //Wildcard generic type
        return Math.abs(this.number.doubleValue()) == Math.abs(number2.number.doubleValue());
    }
}
