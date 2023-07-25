package com.homeworks.DZ8;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Калькуляток запущен!");
        while (true) {
            System.out.println("Введите действие(для выхода введите STOP): ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("stop")) {
                break;
            }
            if(input.matches("\\d+([+\\-*/]\\d+)")) {
                calculate(input);
            } else {
                System.out.println("Введите корректное действие");
            }
        }
    }

    private void calculate(String input) {
        double result = 0;
        String[] split = input.split("[+\\-*/]");
        double a = Double.parseDouble(split[0]);
        double b = Double.parseDouble(split[1]);

        if (input.contains("+")) {
            result = a + b;
        } else if (input.contains("-")) {
            result = a - b;
        } else if (input.contains("*")) {
            result = a * b;
        } else if (input.contains("/")) {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Деление на ноль запрещено.");
                return;
            }
        }

        System.out.println("Результат: " + result);
    }
}
