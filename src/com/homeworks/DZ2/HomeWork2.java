package com.homeworks.DZ2;

public class HomeWork2 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] split = string.replaceAll("[,]", "").split(" ");
        boolean result = false;
        for (int i = 0; i < split.length; i++) {
            System.out.println("Слово" + (i + 1) + " = " + split[i] + " |||| " + " Длина этого слова = " + split[i].length());
        }

        for (int i = 1; i < split.length; i++) {
            if(split[0].length() > split[i].length()) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }


}
