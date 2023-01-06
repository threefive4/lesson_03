package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.rectangleArea();
        rectangle1.rectanglePerimeter();

        Rectangle rectangle = new Rectangle(30, 40);
        rectangle.rectangleArea();
        rectangle.rectanglePerimeter();

        Circle circle = new Circle(20, 40);
        circle.circleArea();
        circle.circleLength();


    }
}
