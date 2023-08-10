package com.homeworks.DZ10.task1shop;

public class Vendor {
    private String name;
    private boolean honesty;

    public Vendor(String name, boolean honesty) {
        this.name = name;
        this.honesty = honesty;
    }

    public String getName() {
        return name;
    }

    public boolean isHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", honesty=" + honesty +
                '}';
    }
}
