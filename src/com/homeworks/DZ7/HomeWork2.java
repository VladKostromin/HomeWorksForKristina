package com.homeworks.DZ7;

import java.util.ArrayList;

public class HomeWork2 {
    public static void main(String[] args) {
        String[] arrayStrings = {"Hello", "teacher", "whats", "up", "?"};
        int[] numbers = {4, 1, 11, 5, 2};
        print();
        print("Hello, teacher");
        print(arrayStrings);
        print(numbers);
        print(1000000, "Will be my salary");
    }
    public static void print() {
        System.out.println("Я пустой");
    }
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static void print(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
    public static void print(int numb, String s) {
        System.out.println("Ваше сообщение - " + s);
        System.out.println("Ваше число - " + numb);
    }
}

