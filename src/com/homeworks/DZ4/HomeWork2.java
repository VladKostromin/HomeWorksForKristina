package com.homeworks.DZ4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input;
        int number = 0;

        while (result != 0) {
            int temp = result % 10;
            number = number * 10 + temp;
            result /= 10;
        }

        if(input == number) {
            System.out.println("Число является полиндромом");
        } else {
            System.out.println("Число не является полиндромом");
        }
    }
}
