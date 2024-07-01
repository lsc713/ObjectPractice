package com.service.javamid.nested.test.ex1;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("book1", "author1");
        library.addBook("book2", "author2");
        library.addBook("book3", "author3");
        library.addBook("book4", "author4");
        library.addBook("book5", "author5");
        library.showBooks();
    }

}
