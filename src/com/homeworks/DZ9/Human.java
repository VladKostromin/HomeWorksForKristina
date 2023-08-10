package com.homeworks.DZ9;


import java.util.Arrays;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[] schedules;

    public Human() {
        schedules = new String[0];
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = 1;
        schedules = new String[0];
    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        schedules = new String[0];
    }

    public Human(String name, String surname, int year, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = 1;
        this.family = family;
        schedules = new String[0];
    }

    public Human(String name, String surname, int year, int iq, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
    }

    public Human(String name, String surname, int year, int iq, Family family, String[] schedules) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.schedules = schedules;
    }

    public void greetPet() {
        System.out.println("Привіт, " + family.getPet().getNickName());
    }

    public void describePet() {
        System.out.println("У мене є "+ family.getPet().getSpecies() +
                ", їй " + family.getPet().getAge() +
                " років, він " + (family.getPet().getTrickLevel() <= 50 ? "майже не хитрий" : "дуже хитрий"));
    }

    public void feedPet() {
        family.getPet().eat();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq + '\'' +
                ", schedule=" + Arrays.toString(schedules) +
                '}';
    }

    public String getName() {
        return name;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
