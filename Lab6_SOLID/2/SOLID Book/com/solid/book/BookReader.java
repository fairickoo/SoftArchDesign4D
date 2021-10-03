package com.solid.book;


import java.util.List;

public class BookReader extends ShowToScreen {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        ShowToScreen.printToScreen(book);
    }
}
