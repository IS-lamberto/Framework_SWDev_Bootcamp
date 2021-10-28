package com.ol.books;

public class Book {
    private String title;
    private double price;
    private Author author;
    private Publisher publisher;
    private double salePercentage;

    public Book(String title, double price, Author author, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setSaleDiscount(double salePercentage) {
        this.salePercentage = salePercentage / 100;
    }

    public double calculateSalePrice() {
        return price - (price * salePercentage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}
