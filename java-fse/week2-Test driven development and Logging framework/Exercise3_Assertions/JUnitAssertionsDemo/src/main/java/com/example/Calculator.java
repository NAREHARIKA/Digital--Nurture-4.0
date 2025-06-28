package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public int[] getArray() {
        return new int[]{1, 2, 3};
    }

    public String getGreeting(boolean morning) {
        return morning ? "Good Morning" : null;
    }
}
