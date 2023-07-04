package com.homeworks.DZ2;

public class HomeWork1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35); //This line that i want to cut, cause
        String[] split = {string2.substring(0,15), string2.substring(16)};//This line that don't want to cut, cause it is perfect
        String string3 = split[0] + "don't" + split[1] + " it is perfect";
        System.out.println(string1 + " ||| lenght: " + string1.length());
        System.out.println(string2 + " ||| lenght: " + string2.length());
        System.out.println(string3 + " ||| lenght: " + string3.length());
    }
}
