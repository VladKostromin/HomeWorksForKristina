package com.homeworks.DZ8;

public class Converter {

    String nameOfConverter;

    public Converter(String nameOfConverter) {
        this.nameOfConverter = nameOfConverter;
    }

    public String getNameOfConverter() {
        return nameOfConverter;
    }

    public int convertToInt(Object input) {
        try {
            return Integer.valueOf(input.toString());
        } catch (NumberFormatException e) {
            System.out.println("Wrong input format ");
            return 0;
        }
    }

    public double convertToDouble(Object input) {
        try {
            return Double.valueOf(input.toString());
        } catch (NumberFormatException e) {
            System.out.println("Wrong input format ");
            return 0.0;
        }
    }
    public String convertToString(Object input) {
        return String.valueOf(input);
    }
}
