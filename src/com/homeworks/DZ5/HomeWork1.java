package com.homeworks.DZ5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] names = new String[100];

        int currentPlayerIndex = 0;
        int input;
        int randomNumber;

        while (true) {
            randomNumber = random.nextInt(101);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            names[currentPlayerIndex] = name;


            System.out.println("Let the game begin!");

            System.out.print("Enter number: ");
            input = scanner.nextInt();

            while (true) {
                if(input < randomNumber) {
                    System.out.println("Your number is too small. Please, try again..");
                } else if (input > randomNumber) {
                    System.out.println("Your number is too big. Please, try again..");
                } else {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
                input = scanner.nextInt();
            }
            currentPlayerIndex++;

            System.out.println("Do you want to continue? yes/no");
            String continuePlaying = scanner.next();
            if(!continuePlaying.equalsIgnoreCase("yes")) {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("List of winners:");
        for (int i = 0; i < names.length; i++) {
            if(names[i] != null) {
                System.out.print(names[i] + "," + " ");
            }
        }
    }
}
