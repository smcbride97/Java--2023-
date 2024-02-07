package oo.Calculator;

public class Power extends Operator<Integer>{
    public Power(int n) {
        super(n);
    }

    @Override 
    public Integer calculate() {
        return (int) Math.pow(super.operands.get(0), super.operands.get(1));
    }
}
