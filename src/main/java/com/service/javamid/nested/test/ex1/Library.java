package com.service.javamid.nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;

    private static class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public Library(int size) {
        this.books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("save failed");
        }
    }

    public void showBooks() {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println(book.title+book.author);
        }
    }

}
