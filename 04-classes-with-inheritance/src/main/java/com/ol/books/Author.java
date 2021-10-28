package com.ol.books;

public class Author extends Person {
    private String genre;

    public Author(String name, Address address) {
        super(name, address);
    }

    public Author(String name, Address address, String genre) {
        super(name, address);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() +
                "genre='" + genre + '\'' +
                '}';
    }
}
