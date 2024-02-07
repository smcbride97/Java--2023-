// Using bounded type to ensure type compatibility
public class GenericPair<T, V extends T> {
    T first;
    V second;

    GenericPair(T first, V second) {
        this.first = first;
        this.second = second;
    }
}
