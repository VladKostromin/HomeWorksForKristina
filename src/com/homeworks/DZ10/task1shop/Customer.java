package com.homeworks.DZ10.task1shop;

public class Customer {

    private String name;
    private int age;
    private Product product;
    private boolean coupon;


    public Customer(String name, int age, Product product, boolean coupon) {
        this.name = name;
        this.age = age;
        this.product = product;
        this.coupon = coupon;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", coupon=" + coupon +
                '}';
    }
}
