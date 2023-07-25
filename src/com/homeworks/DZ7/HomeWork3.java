package com.homeworks.DZ7;

import java.awt.*;

public class HomeWork3 {
    public static void main(String[] args) {
        StudentCard studentCard = new StudentCard();
        studentCard.fullName = "Kristina Gvozdetskaya";
        studentCard.subject = "Qa Automation Testing";
        studentCard.nameOfInstitution = "Стоматологічна клініка «Прованс»";
        studentCard.coverColor = "Pink";
        studentCard.amountOfPages = 100;
        studentCard.yearOfGraduation = 2023;
        System.out.println(studentCard);
    }
}
