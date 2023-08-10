package com.homeworks.DZ10.task1shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product jackD = new Product("Jack Daniels", 150, ProductTypes.ALCOHOL);
        Product solomon = new Product("Solomon", 100, ProductTypes.FOOD);
        Product coke = new Product("Coca-Cola", 10, ProductTypes.DRINKS);
        Product cigarettes = new Product("Camel", 50, ProductTypes.TOBACCO);
        Product bear = new Product("Staropramen", 80, ProductTypes.ALCOHOL);
        ArrayList<Product> products = new ArrayList<>();
        products.add(jackD);
        products.add(solomon);
        products.add(coke);
        products.add(cigarettes);

        Vendor vendor = new Vendor("Petya", true);
        Customer customer = new Customer("Vasya", 18, jackD, true);

        Shop shop = new Shop("АТБ", products, vendor);
        System.out.println(shop.returnCost(customer));
    }
}
