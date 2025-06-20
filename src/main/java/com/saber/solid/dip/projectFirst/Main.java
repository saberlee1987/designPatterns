package com.saber.solid.dip.projectFirst;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World $$$$$$");

        CalculatorOperation add = (Double::sum);
        CalculatorOperation sub = ((n1, n2) -> n1-n2);
        Calculator calculatorAdd = new Calculator(add);
        Calculator calculatorSub = new Calculator(sub);

        System.out.println(calculatorAdd.solve(12,34));
        System.out.println(calculatorSub.solve(56,27));
    }
}
