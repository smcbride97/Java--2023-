// class class-name<type-param-list>
public class GenericTwo<T, V> {
    T object1;
    V object2;

    GenericTwo(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return this.object1;
    }

    public V getObject2() {
        return this.object2;
    }
    public String toString() {
        return String.format("Type of T is %s, Value of T is %s, \n Type of V is %s, Value of V is %s", 
            object1.getClass().getName(), getObject1(), object2.getClass().getName(), getObject2());

    }
}
