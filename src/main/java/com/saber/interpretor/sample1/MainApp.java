package com.saber.interpretor.sample1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("sample 1 inteprate");

        // ( 7  - 2) + ( 3  * 2 ) + ( 8 + 10 )
        Context context = new Context();
        AddtExpression expression = new AddtExpression(
                new AddtExpression(
                        new SubtractExpression(
                                new NumberExpressionI(7),
                                new NumberExpressionI(2)
                        ),
                        new MultiplicationtExpression(
                                new NumberExpressionI(3),
                                new NumberExpressionI(2)
                        )
                ),
                new AddtExpression(
                        new NumberExpressionI(8),
                        new NumberExpressionI(10)
                )
        );
        int result = expression.inteprete(context);
        System.out.println("result ===> "+result);

    }
}
