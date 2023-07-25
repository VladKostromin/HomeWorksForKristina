package com.homeworks.DZ8;

public class Tree {

    String type;
    int height;
    int countOfSticks;
    String color;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.color = "Зеленый";
    }

    public Tree(int height, int countOfSticks, String color) {
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.color = color;
        this.type = "пихта";
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.color = "Желтый";
    }

    public Tree(String type) {
        this();
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type - " + type + "\n" +
                "Height - " + height + "\n" +
                "Count of sticks - " + countOfSticks + "\n" +
                "Color - " + color + "\n";
    }
}
