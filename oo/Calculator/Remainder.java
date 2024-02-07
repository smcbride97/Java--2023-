package oo.Calculator;

public class Remainder extends Operator<Integer>{
    public Remainder(int n) {
        super(n);
    }

    @Override 
    public Integer calculate() {
        return super.operands.get(0) % super.operands.get(1);
    }
}
