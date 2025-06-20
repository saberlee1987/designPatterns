package com.saber.interpretor.sample1;

public class MultiplicationtExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public MultiplicationtExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int inteprete(Context context) {
        return left.inteprete(context) * right.inteprete(context);
    }
}
