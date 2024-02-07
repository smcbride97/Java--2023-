package oo.Calculator;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class Calculator {
    private Map<String, Operator<Integer>> operators = new HashMap<>();

    public Calculator() {
        // +, -, *, /, %, ~, **
        operators.put("+", new Add(2));
        operators.put("-", new Subtract(2));
        operators.put("*", new Multiply(2));
        operators.put("/", new Divide(2));
        operators.put("%", new Remainder(2));
        operators.put("~", new Negation(1));
        operators.put("**", new Power(2));
    }

    public List<Token<Integer>> parse(String expression) {
        if (expression == null || expression.isEmpty())
            throw new IllegalArgumentException("Invalid expression");

        String[] tokenstr = expression.split(" ");
        List<Token<Integer>> tokens = new ArrayList<>();

        for (String token : tokenstr) {
            if (operators.containsKey(token)){
                tokens.add(operators.get(token));
            } else {
                try {
                    tokens.add(new Operand(Integer.parseInt(token)));
                } catch (NumberFormatException ex) {
                    throw new IllegalArgumentException("Invalid token " + token, ex);
                }
            }
        }

        return tokens;
    }
 
    public Integer calculate(String expression) { 
        List<Token<Integer>> tokens = parse(expression);
        if (tokens.get(1) instanceof Operator)
            return tokens.get(1).process(tokens); 
        else    
            return tokens.get(0).process(tokens);
    }

    public static void main(String[] args) {
        System.out.println("Java Calculator");
        System.out.println("Enter calculation in this format: number, operator, number");

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        String expression;
        while (!((expression = sc.nextLine()).equals("q"))) {
            try {
                System.out.println(cal.calculate(expression));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage() + ", please try again");
            }
        }
    }
}
