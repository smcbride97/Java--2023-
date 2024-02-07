package oo.Calculator;

public class Subtract extends Operator<Integer> {
    public Subtract(int n) {
        super(n);
    }

    @Override 
    public Integer calculate() {
        return super.operands.get(0) - super.operands.get(1);
    }
}
