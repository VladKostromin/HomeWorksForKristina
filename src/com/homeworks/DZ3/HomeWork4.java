package com.homeworks.DZ3;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        if(numb == 1) {
            System.out.println("Понедельник");
        } else if (numb == 2){
            System.out.println("Вторник");
        } else if (numb == 3) {
            System.out.println("Среда");
        } else if (numb == 4) {
            System.out.println("Четверг");
        } else if (numb == 5) {
            System.out.println("Пятница");
        } else if (numb == 6) {
            System.out.println("Суббота");
        } else if (numb == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("“Лучше бы сегодня была пятница”");
        }
    }
}
