package com.homeworks.DZ3;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите оператор: ");
        String operator = scanner.next();

        int result = operator.equals("+") ? a + b : operator.equals("-") ? a - b : operator.equals("*") ? a * b : operator.equals("/") ? a / b : operator.equals("%" ) ? a % b : 0;
        System.out.println("Результат: " + result);
    }
}
