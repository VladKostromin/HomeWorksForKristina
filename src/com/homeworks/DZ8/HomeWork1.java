package com.homeworks.DZ8;

public class HomeWork1 {
    public static void main(String[] args) {
        Computer computer1 = new Computer
                ("Apple", 10000, 16000, 8000);
        Computer computer2 = new Computer
                ("Intel", 9000, 16000, 8000);
        System.out.print("Is computers same: ");
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1);
    }
}
