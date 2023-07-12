package com.homeworks.DZ4;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[45];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) - 50;
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            } else if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
