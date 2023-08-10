package com.homeworks.DZ10.task3fathershop;

public class Product {
    private ProductType productType;
    private int price;

    public Product(ProductType productType, int price) {
        this.productType = productType;
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getPrice() {
        return price;
    }
}
