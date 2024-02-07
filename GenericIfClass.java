// Any class implements generic interface must be generic itself
public class GenericIfClass<T> implements GenericInterface<T> {
    private T[] arry;

    GenericIfClass(T[] arry) {
        this.arry = arry;
    }

    public boolean contains(T a) {
        for(T x : this.arry)
            if (x.equals(a)) return true;
        
        return false;
    }
}
