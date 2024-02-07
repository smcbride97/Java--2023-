public class GenQImpl<T> implements GenQ<T>{
    private T[] q;
    private int start, end;

    public GenQImpl(T[] arry) {
        this.q = arry;
        this.start = this.end = 0;
    }

    @Override
    public void enQueue(T item) throws GenQException{
        if (this.end == q.length)
          throw new GenQException("Queue is full");
        q[end++] = item;
    }

    @Override
    public T deQueue()  throws GenQException {
        if (this.start == this.end)
            throw new GenQException("Queue is empty");

        return q[start++];
    }

    @Override
    public int size() {
        return this.end - this.start;
    }
}
