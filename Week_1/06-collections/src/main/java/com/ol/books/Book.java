package com.ol.books;

public class Book extends Product {
    private Author author;
    private Publisher publisher;
    private static int counter;

    public Book(String title, double price, Author author, Publisher publisher) {
        super(title, price);
        this.author = author;
        this.publisher = publisher;
        counter++;
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

    public static int getCount() {
        return counter;
    }

    @Override
    public void printer() {
        System.out.printf(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "author=" + author +
                ", publisher=" + publisher +
                '}';
    }
}
