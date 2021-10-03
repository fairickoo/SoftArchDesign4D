package com.solid.book;


import java.util.List;

public class BookPublisher extends ShowToFile {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        ShowToFile.printToFile(book);
    }
}
