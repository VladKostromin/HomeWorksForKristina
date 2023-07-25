package com.homeworks.DZ7;

import java.awt.*;

public class StudentCard {
    String fullName;
    String subject;
    int amountOfPages;
    int yearOfGraduation;
    String coverColor;
    String nameOfInstitution;

    @Override
    public String toString() {
        return "Full name - " + fullName + "\n" +
                "Subject - " + subject + "\n" +
                "Cover color - " + coverColor + "\n" +
                "Name of Institution - " + nameOfInstitution + "\n" +
                "Amount of pages - " + amountOfPages + "\n" +
                "Year of graduation - " + yearOfGraduation;
    }
}


