package com.akadatsly;

public class Calculator {

    public static Calculator getInstance() {
        return new Calculator();
    }

    public int div(int a, int b) {
        return a / b;
    }

}
