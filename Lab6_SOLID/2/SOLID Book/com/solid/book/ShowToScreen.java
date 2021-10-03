package com.solid.book;

public class ShowToScreen {
    static void printToScreen(Book book) {
        //Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
