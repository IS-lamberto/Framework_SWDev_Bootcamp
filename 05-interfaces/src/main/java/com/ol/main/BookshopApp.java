package com.ol.main;

import com.ol.books.*;

public class BookshopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Bookshop");
        Address authorAddress = new Address(10, "High Street",
                "Any Town",
                "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress, "Technical");
        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher =
                new Publisher("Bill Smith",
                        publisherAddress, "Tech Books Publishing Ltd.");
        Book book = new Book("Java Unleashed",
                15.95, author, publisher);
        System.out.println("Book: " + book);
        System.out.println("\nCalculating the Sales Discount price");
        book.setSaleDiscount(10.0);
        System.out.println("Sale price of book: " +
                book.calculateSalePrice());
        Book book2 = new Book("Java For Professionals", 12.55,
                author, publisher);
        System.out.println("\nBook2: " + book2);
        System.out.println("Book Instance Count: " + Book.getCount());

        Sales salesProduct = book;
        salesProduct.setSaleDiscount(10.0);
        System.out.println("Sale price of book: " +
                salesProduct.calculateSalePrice());

        author.prettyPrint();
        publisher.prettyPrint();
    }
}

