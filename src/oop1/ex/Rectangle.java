package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (height + width);
    }

    boolean isSquare() {
        return width==height;
    }
}
