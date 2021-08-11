package com.company;

public class CalculatorImpl implements Calculator {
    @Override
    public void sum(double x, double y) {
        System.out.println(x + y);
    }

    @Override
    public void diff(double x, double y) {
        System.out.println(x - y);
    }

    @Override
    public void mult(double x, double y) {
        System.out.println(x * y);
    }

    @Override
    public void div(double x, double y) {
        System.out.println(x / y);
    }
}
