package com.solid.lsp;


public class Main {

    private static final int width = 4;
    private static final int height = 5;

    private static final int side = 3;

    public static void main(String[] args) {
        //Rectangle
        Rectangle reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        //Square 
        Square reg2 = new Square(side);
        System.out.println("====   Square  ====");
        System.out.println("side = " + side);
        System.out.println("Area = " + reg2.getArea());
    }
}
