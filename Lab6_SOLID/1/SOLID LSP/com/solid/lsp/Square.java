package com.solid.lsp;

public class Square implements ShapeArea {
    private int side;

    Square() {
      
    }

    Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    
    public int getSide() {
        return side;
    }

    public int getArea() {
        return side * side;
    }
}
