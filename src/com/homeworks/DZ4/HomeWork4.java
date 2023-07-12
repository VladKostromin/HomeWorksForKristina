package com.homeworks.DZ4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон",};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        int[] times = {10, 12, 14, 16, 18, 20};
        System.out.println("Введите цифры: ");
        Scanner scanner = new Scanner(System.in);
        String inputName = names[scanner.nextInt()];
        int inputTime = times[scanner.nextInt()];
        String inputPlace = places[scanner.nextInt()];
        System.out.println(inputName + " будет идти в " + inputPlace + " в " + inputTime + ":00");

    }
}
