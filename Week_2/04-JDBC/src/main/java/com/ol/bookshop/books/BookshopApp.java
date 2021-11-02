package com.ol.bookshop.books;

import java.sql.SQLException;

public class BookshopApp {
    public static void main(String [] args) throws SQLException {
        Bookshop bookshop = new Bookshop();
        bookshop.setup();
        System.out.println(bookshop.getAllBooks());
        Book b1 = bookshop.getBookByISBN(2);
        System.out.println(b1);
        Book b2 = new Book(7, "Java For Professionals", "Technical", "John Anders");
        bookshop.saveBook(b2);
        System.out.println(bookshop.getAllBooks());
        bookshop.deleteBook(b2);
        System.out.println(bookshop.getAllBooks());
        bookshop.shutdown();
    }
}
