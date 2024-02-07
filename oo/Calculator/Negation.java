package oo.Calculator;

import java.util.List;

public class Negation extends Operator<Integer>{
    public Negation(int n) {
        super(n);
    }

    @Override public Integer process(List<Token<Integer>> tokens) {
        this.operands.clear();
        this.operands.add(tokens.get(1).process(tokens));
        return calculate();
    }

    @Override 
    public Integer calculate() {
        return -super.operands.get(0);
    }
}
