package com.homeworks.DZ10.task1shop;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private ProductTypes productType;

    public Product(String name, int price, ProductTypes productType) {
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productTypes=" + productType +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductTypes getProductType() {
        return productType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() && Objects.equals(getName(), product.getName()) && getProductType() == product.getProductType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getProductType());
    }
}
