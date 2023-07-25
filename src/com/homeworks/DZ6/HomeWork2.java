package com.homeworks.DZ6;

import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[][] gameField = new String[6][6];
        gameFieldInit(gameField);

        int winRow = random.nextInt(4) + 1;
        int winCol = random.nextInt(4) + 1;

        System.out.println("All Set. Get ready to rumble!");
        while (true) {
            int targetRow;
            int targetColumn;
            printField(gameField);

            while (true) {
                System.out.print("Please enter row number for shot: ");
                targetRow = scanner.nextInt();
                if(isShotInBound(targetRow)) {
                    break;
                }
                System.out.println("Not valid input. Place your shot in number from 1 to 5");
            }
            while (true) {
                System.out.print("Please enter column number for shot: ");
                targetColumn = scanner.nextInt();
                if(isShotInBound(targetColumn)) {
                    break;
                }
                System.out.println("Not valid input. Place your shot in number from 1 to 5");
            }
            if (gameField[targetRow][targetColumn].equals("-")) {
                gameField[targetRow][targetColumn] = "*";
            }
            if (gameField[winRow][winCol] == gameField[targetRow][targetColumn] && gameField[targetRow][targetColumn].equals("*")) {
                gameField[targetRow][targetColumn] = "x";
                printField(gameField);
                System.out.println("You have won!");
                break;
            }

        }

    }

    private static void gameFieldInit(String[][] gameField) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(i == 0) {
                    gameField[i][j] = String.valueOf(j);
                } else if (j == 0) {
                    gameField[i][j] = String.valueOf(i);
                } else {
                    gameField[i][j] = "-";
                }
            }
        }
    }

    private static void printField(String[][] gameField) {
        for (int i = 0; i < 6; i++) {
            System.out.print("[");
            for (int j = 0; j < 6; j++) {
                if(j == 5) {
                    System.out.print(gameField[i][j]);
                } else {
                    System.out.print(gameField[i][j] + ", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
    private static boolean isShotInBound(int value) {
        return value >= 1 && value <= 5;
    }

}
