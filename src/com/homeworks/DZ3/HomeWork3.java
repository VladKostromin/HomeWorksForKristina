package com.homeworks.DZ3;

import java.util.Date;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год вашего рождения: ");
        int yearOfBirth = scanner.nextInt();

        Date currentDate = new Date();
        int currentYear = currentDate.getYear() + 1900;

        int age = currentYear - yearOfBirth;

        System.out.println("Ваш возраст: " + age + " лет");
    }
}
