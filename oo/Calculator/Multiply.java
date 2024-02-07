package oo.Calculator;

public class Multiply extends Operator<Integer>{
    public Multiply(int n) {
        super(n);
    }

    @Override 
    public Integer calculate() {
        return super.operands.get(0) * super.operands.get(1);
    }
}
