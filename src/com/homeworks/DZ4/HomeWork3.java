package com.homeworks.DZ4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Общий вес который можно хранить на складе: ");
        int capacity = scanner.nextInt();
        int spaceInStorage = capacity;
        while (spaceInStorage > 0) {
            System.out.print("Вес металла для сдачи на склад: ");
            int weightOfMetal = scanner.nextInt();

            if (weightOfMetal < 5 && !(spaceInStorage < 5)) {
                System.out.println("Невозможно принять металл массой меньше 5.");
                continue;
            } else if (weightOfMetal > spaceInStorage) {
                System.out.println("Недостаточно места на складе. Невозможно принять весь металл.");
                continue;
            }

            spaceInStorage -= weightOfMetal;
            System.out.println("Металл принят, осталось места на складе: " + spaceInStorage);
        }

        System.out.println("Склад заполнен!!");
    }
}
