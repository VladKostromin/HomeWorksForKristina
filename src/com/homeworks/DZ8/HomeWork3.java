package com.homeworks.DZ8;

public class HomeWork3 {
    public static void main(String[] args) {
        Converter converter = new Converter("MyConverter");
        byte test1 = 5;
        String test2 = "64.32";
        short test3 = 5;
        int a =  converter.convertToInt(test1);
        double b = converter.convertToDouble(test2);
        String c = converter.convertToString(test3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
