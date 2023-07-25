package com.homeworks.DZ6;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        int[] result = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(1001);
            }
        }

        for (int i = 0; i < rows; i++) {
            int max = array[i][0];
            for (int j = 1; j < columns; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
            result[i] = max;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "," + " ");
        }
    }
}
