package ua.lviv.lgs;

public class Rectangle {
    int length;
    int width;

    public Rectangle() {
        this.length = 20;
        this.width = 50;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void rectangleArea() {
        int area = length * width;
        System.out.println("Площа прямокутника = " + area);
    }

    public void rectanglePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Периметр прямокутника = " + perimeter);
    }
}


