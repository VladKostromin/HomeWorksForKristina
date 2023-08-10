package com.homeworks.DZ10.task1shop;

import java.util.ArrayList;

public class Shop {

    private String shopName;
    private ArrayList<Product> products;
    private Vendor vendor;

    public Shop() {
    }

    public Shop(String shopName, ArrayList<Product> products, Vendor vendor) {
        this.shopName = shopName;
        this.products = products;
        this.vendor = vendor;
    }

    public String returnCost(Customer customer) {
        Product productForSale = getCustomerProduct(customer.getProduct());
        if(productForSale == null) {
            return "Такого товара в нашем магазне нет";
        }
        String result;
        String alcoholCheck;
        if (customer.getProduct().getProductType() == ProductTypes.ALCOHOL &&
                customer.getAge() < 18 && vendor.isHonesty()) {
            alcoholCheck = "не продаст этот товар, продукт содержит алкоголь и вам нет 18 лет";
        } else {
            alcoholCheck = "продаст вам этот товар " + productForSale.getName() +
                    ", тип вашего продукта: " + productForSale.getProductType().getType() +
                    ", ваш возраст - " + customer.getAge() +
                    ". Стоймость вашей покупки равна - " + "'" + productForSale.getPrice() +
                    "'. " + (customer.isCoupon() == true ? "Вот вам скидка 10%" : "У вас нету купона");
        }


        result = "Уважаемый " + customer.getName() + ", продовец: " +
                vendor.getName() + " нашего магазина '" + shopName +
                "' " + alcoholCheck;
        return result;
    }

    public Product getCustomerProduct(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if(products.contains(product)) {
                return products.get(i);
            }
        }
        return null;
    }


}
