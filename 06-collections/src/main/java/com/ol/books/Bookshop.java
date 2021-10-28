package com.ol.books;

import java.util.ArrayList;
import java.util.List;

public class Bookshop {
    private List<Book> books = new ArrayList<>();

    /*
    Instantiate and populate a Bookshop with Books
     */
    public Bookshop() {
        this.books = books;
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
        Book book2 = new Book("Java For Professionals", 12.55,
                author, publisher);

        // Add books to the books ArrayList
        books.add(book);
        books.add(book2);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
