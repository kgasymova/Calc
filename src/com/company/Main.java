package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        App app = new App(calculator);
        app.menu();
    }
}
