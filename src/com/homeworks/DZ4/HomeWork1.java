package com.homeworks.DZ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        System.out.println("Введите слова(для остановки введите - 'STOP'): ");
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            stringList.add(input);
            input = scanner.nextLine();
        }
        for (String s : stringList) {
            System.out.print(s);
        }
    }


}
