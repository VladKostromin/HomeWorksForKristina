package com.homeworks.DZ3;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название программы: ");
        String programInput = scanner.nextLine();
        System.out.print("Введите название ОС: ");
        String osInput = scanner.nextLine();

        String ide;
        String os;

        switch (programInput) {
            case "IntelliJ IDEA" :
                ide = "https://www.jetbrains.com/idea/download/";
                break;
            case "Git" :
                ide = "https://github.com/git-guides/install-git";
                break;
            case "Java" :
                ide = "https://www.java.com/download/ie_manual.jsp";
                break;
            default:
                ide = "Такой программы не существует";
        }
        switch (osInput) {
            case "Linux" :
                os = "Используемая ОС: Linux";
                break;
            case "macOS" :
                os = "Используемая ОС: macOS";
                break;
            case "Windows" :
                os = "Используемая ОС: Windows";
                break;
            default:
                os = "Такой ОС не существует";
        }

        System.out.println(os);
        System.out.println("Ссылка на скачивание программы: " + ide);
    }
}
