package com.homeworks.DZ10.task1shop;

public enum ProductTypes {
    ALCOHOL("Алкоголь"),
    TOBACCO("Табак"),
    FOOD("Еда"),
    DRINKS("Напитки");

    private final String type;

    ProductTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
