package com.homeworks.DZ2;

public class HomeWork3 {
    public static void main(String[] args) {
        String s = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] split = s.split("[a]");
        System.out.println(split.length);
    }
}
