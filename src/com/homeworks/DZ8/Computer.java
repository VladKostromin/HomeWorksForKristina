package com.homeworks.DZ8;

import java.util.Objects;

public class Computer {
    private String brand;
    private int price;
    private int ram;
    private int videoCard;

    public Computer(String brand, int price, int ram, int videoCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Создан PC." + "\n" +
                "Имя = " + brand + "\n" +
                "Цена = " + price + "\n" +
                "Видеокарда = " + videoCard + "\n" +
                "ОЗУ = " + ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getRam() == computer.getRam() && getVideoCard() == computer.getVideoCard() && getBrand().equals(computer.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getRam(), getVideoCard());
    }
}
