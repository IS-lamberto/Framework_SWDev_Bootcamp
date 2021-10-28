package com.ol.books;

public abstract class Product {
    private String title;
    private double price;
    private double salePercentage;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSaleDiscount(double salePercentage) {
        this.salePercentage = salePercentage / 100;
    }

    public double calculateSalePrice() {
        return price - (price * salePercentage);
    }

    public abstract void printer();

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
