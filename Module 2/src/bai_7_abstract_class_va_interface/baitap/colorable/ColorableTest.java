package bai_7_abstract_class_va_interface.bai_tap.colorable;

import bai_7_abstract_class_va_interface.bai_tap.resizeable.Rectangle;
import bai_7_abstract_class_va_interface.bai_tap.resizeable.Square;

public class ColorableTest {
    public static void main(String[] args) {

        Rectangle[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(4);
        squares[2] = new Square(4,"blue", false);
        for (Rectangle square: squares) {
            System.out.println(square);
            if (square.isFilled()) {
                square.howToColor();
            }
        }
    }
}
