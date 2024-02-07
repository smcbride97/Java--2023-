package oo.Calculator;

import java.util.List;

public class Operand<T extends Number> implements Token<T> {
    private T value;

    public Operand(T value) {
        this.value = value;
    }

    @Override
    public T process(List<Token<T>> tokens) {
        return this.value;
    }
}
