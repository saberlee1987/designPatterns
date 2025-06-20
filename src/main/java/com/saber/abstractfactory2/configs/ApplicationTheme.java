package com.saber.abstractfactory2.configs;

public enum ApplicationTheme {
    DARK(0) , LIGHT(1);
    private final Integer code;

    ApplicationTheme(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
