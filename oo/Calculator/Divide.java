package oo.Calculator;

public class Divide extends Operator<Integer>{
    public Divide(int n) {
        super(n);
    }

    @Override 
    public Integer calculate() {
        return super.operands.get(0) / super.operands.get(1);
    }
}
