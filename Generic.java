// Generic class <T>
public class Generic<T> {
    private T object;

    Generic(T object) {
        this.object = object;
        //this.object = new T(); // Type parameters can't be instatiated
    }

    public T getObject() {
        return this.object;
    }

    public String toString() {
        return String.format("Type of T is %s, value of object is %s", this.object.getClass().getName(), this.getObject());
    }
}
