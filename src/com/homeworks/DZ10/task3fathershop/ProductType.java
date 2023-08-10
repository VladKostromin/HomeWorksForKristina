package com.homeworks.DZ10.task3fathershop;

public enum ProductType {
    APPLE("яблоко"),
    POTATO("картошка"),
    MILK("молоко"),
    BEAR("пиво"),
    TOBACCO("табак");

    private final String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
