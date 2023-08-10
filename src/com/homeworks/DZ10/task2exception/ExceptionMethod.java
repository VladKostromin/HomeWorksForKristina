package com.homeworks.DZ10.task2exception;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExceptionMethod {

    public static void main(String[] args) {
        double result = 0;
        try {
            result = generateArray();
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);

    }

    //ArithmeticException - divide by zero
    //ArrayOutOfBounds

    public static double generateArray() throws DivideByZeroException, OutOfBoundException {
        Random random = new Random();
        double result;
        int[] array = new int[random.nextInt(30) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31);
        }
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите идекс случайно сгенерированного массива: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= array.length) {
            throw new OutOfBoundException("Индекс за пределами созданного массива");
        }
        if(array[index] == 0 || array[0] == 0) {
            throw new DivideByZeroException("Упс, деление на '0' запрещено");
        }
        result = (double) array[index] / array[0];
        return result;


    }
}
