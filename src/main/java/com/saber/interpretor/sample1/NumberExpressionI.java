package com.saber.interpretor.sample1;

public class NumberExpressionI implements Expression {

    private final int value;

    public NumberExpressionI(int value) {
        this.value = value;
    }

    @Override
    public int inteprete(Context context) {
        return this.value;
    }
}
