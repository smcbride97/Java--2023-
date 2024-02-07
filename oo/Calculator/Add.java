package oo.Calculator;

public class Add extends Operator<Integer> {
    public Add(int n) {
        super(n);
    }

    @Override 
    public Integer calculate() {
        return super.operands.get(0) + super.operands.get(1);
    }
}
