package com.homeworks.DZ9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] dogHabits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("Dog", "Rock", 5, 75, dogHabits);

        Human kyle = new Human("Kyle", "Reese", 2053, 130);
        Human sarah = new Human("Sarah", "Connor", 1975, 130);


        Human ryan = new Human("Ryan", "Reynolds",1976, 80);
        Human blake = new Human("Blake", "Lively", 1987, 85);

        Family connorFamily = new Family(sarah, kyle);
        Family ryanBlakeFamily = new Family(blake, ryan);

        ryan.getFamily().setPet(pet);


        String[] connorSchedules = {"Вбити т100", "Вбити т1000", "Вбити ще одного т1000"};
        Human childJohnConnor = new Human("John", "Connor", 1990, 130, connorFamily, connorSchedules);

        String[] reynoldsFamilySchedules = {"Поспати", "Поїсти", "Ще раз поспати"};
        Human childJamesReynolds = new Human("James", "Reynolds", 2014, 70, ryanBlakeFamily, reynoldsFamilySchedules);
        Human childInezReynolds = new Human("Inez", "Reynolds", 2016, 50, ryanBlakeFamily, reynoldsFamilySchedules);
        Human childBettyReynolds = new Human("Betty", "Reynolds", 2019, 30, ryanBlakeFamily, reynoldsFamilySchedules);

        connorFamily.addChild(childJohnConnor);
        ryanBlakeFamily.addChild(childJamesReynolds);
        ryanBlakeFamily.addChild(childInezReynolds);
        ryanBlakeFamily.addChild(childBettyReynolds);

        System.out.println(ryanBlakeFamily);
        System.out.println(connorFamily);
        ryanBlakeFamily.getFather().greetPet();
        ryanBlakeFamily.getFather().describePet();
        ryanBlakeFamily.getFather().feedPet();
        System.out.println(ryanBlakeFamily.countFamily());
        System.out.println(connorFamily.countFamily());

    }
}
