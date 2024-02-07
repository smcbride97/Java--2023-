public interface GenQ<T> {
    void enQueue(T item) throws GenQException;
    T deQueue() throws GenQException;
    int size();
}
