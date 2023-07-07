package com.homeworks.DZ3;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третее число: ");
        int c = scanner.nextInt();

        if(a + b > c && b + c > a && c + a > b) {
            System.out.println("Треугольник можно построить");
        } else {
            System.out.println("Треугольник построить нельзя!");
        }
    }
}
