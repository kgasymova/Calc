package com.company;

import java.util.Scanner;

public class App {

    public static final String WELCOME_MASSAGE = "Press: \n" + "1 - Exit \n" +
            "2 - Sum \n" +
            "3 - Diff\n" +
            "4 - Multi\n" +
            "5 - Div\n";


    public static final int EXIT = 1, SUM = 2, DIFFERENCE = 3, MULTIPLICATION = 4, DIVISION = 5;
    public static final String DELIMITER = "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\";

    private final Scanner scanner = new Scanner(System.in);
    private final Calculator calculator;

    public App(Calculator calculator) {
        this.calculator = calculator;
    }


    public void menu() {
        boolean isRun = true;

        while (isRun) {
            System.out.println(WELCOME_MASSAGE);
            System.out.println(DELIMITER);

            int consoleChoice = scanner.nextInt();
            if (consoleChoice == EXIT) {
                System.out.println("App closes");
                break;
            }

            System.out.println("Enter a double number: \n");
            double x = scanner.nextDouble();
            System.out.println("Enter a double number: \n");
            double y = scanner.nextDouble();

            switch (consoleChoice) {
                case SUM:
                    calculator.sum(x, y);
                    System.out.println(DELIMITER);
                    break;

                case DIFFERENCE:
                    calculator.diff(x, y);
                    System.out.println(DELIMITER);
                    break;

                case MULTIPLICATION:
                    calculator.mult(x, y);
                    System.out.println(DELIMITER);
                    break;

                case DIVISION:
                    calculator.div(x, y);
                    System.out.println(DELIMITER);
                    break;


            }

        }
    }
}
