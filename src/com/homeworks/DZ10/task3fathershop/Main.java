package com.homeworks.DZ10.task3fathershop;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product(ProductType.MILK, 15);
        Product apple = new Product(ProductType.APPLE, 5);
        Product bear = new Product(ProductType.BEAR, 30);
        Product tobacco = new Product(ProductType.TOBACCO, 60);

        Father father1 = new Father("Валентин", 105);

        try {
            father1.tryToBuy(milk, 6, apple, 3);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (NotAllowedPurchaseException e) {
            System.out.println(e.getMessage());
        } catch (DivideByThreeException e) {
            System.out.println(e.getMessage());
        }
    }
}
