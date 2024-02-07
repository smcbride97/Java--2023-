package oo.Calculator;

import java.util.List;
import java.util.ArrayList;

public abstract class Operator<T extends Number> implements Token<T> {
    private int n; // number of operands for this operator
    protected List<T> operands;

    Operator(int n) {
        this.n = n;
        this.operands = new ArrayList();
    }

    @Override public T process(List<Token<T>> tokens) {
        this.operands.clear();
        this.operands.add(tokens.get(0).process(tokens));
        this.operands.add(tokens.get(2).process(tokens));
        return calculate();
    }

    public abstract T calculate();
}
