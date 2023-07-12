package com.homeworks.DZ4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i : numbers) {
            System.out.print(i + " : ") ;
        }
        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        boolean isNumberPresent = isNumberPresent(numbers, input);
        if(isNumberPresent) {
            System.out.println("Число есть в массиве");
        } else {
            System.out.println("Числа нет в массиве");
        }
    }

    public static boolean isNumberPresent(int[] array, int numberToCheck) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == numberToCheck) {
                return true;
            }
        }
        return false;
    }
}
