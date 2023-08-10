package com.homeworks.DZ10.task3fathershop;

public class Father {
    private String name;
    private int money;

    public Father(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void tryToBuy(Product product, int quantity) throws NotEnoughMoneyException, NotAllowedPurchaseException, DivideByThreeException {
        int allProductsCost = product.getPrice() * quantity;

        if(allProductsCost > money) throw new NotEnoughMoneyException("Не хватает денег для покупки");
        if(product.getProductType() == ProductType.BEAR ||
                product.getProductType() == ProductType.TOBACCO) throw new NotAllowedPurchaseException("Запрещенная покупка!!");
        if(quantity % 3 != 0) throw new DivideByThreeException("Нужно чтобы количество товаров хватило всю семью (на 3х людей)");

        System.out.println("Уважаемый " + name + " стоимость ваших покупок - " +
                allProductsCost + ", вы приобрели '" +
                product.getProductType().getType() +
                "' в количестве " + quantity);
    }

    public void tryToBuy(Product firstProduct, int firstQuantity, Product secondProduct, int secondQuantity) throws NotEnoughMoneyException, NotAllowedPurchaseException, DivideByThreeException {
        int allProductsCost = firstProduct.getPrice() * firstQuantity + secondProduct.getPrice() * secondQuantity;

        if(allProductsCost > money) throw new NotEnoughMoneyException("Не хватает денег для покупки");
        if(firstProduct.getProductType() == ProductType.BEAR ||
                firstProduct.getProductType() == ProductType.TOBACCO ||
                secondProduct.getProductType() == ProductType.BEAR ||
                secondProduct.getProductType() == ProductType.TOBACCO) throw new NotAllowedPurchaseException("Запрещенная покупка!!");
        if(firstQuantity % 3 != 0 || secondQuantity % 3 != 0) throw new DivideByThreeException("Нужно чтобы количество товаров хватило всю семью (на 3х людей)");

        System.out.println("Уважаемый " + name + " стоимость ваших покупок - " +
                allProductsCost + ", вы приобрели '" +
                firstProduct.getProductType().getType() +
                "' в количестве " + firstQuantity + ", и '" +
                secondProduct.getProductType().getType() +
                "' в количестве " + secondQuantity);
    }
}
