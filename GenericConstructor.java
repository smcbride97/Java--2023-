public class GenericConstructor {
    private int x;

    <T extends Number> GenericConstructor(T x) {
        this.x = x.intValue();
    }

    int getX() {
        return this.x;
    }
}
