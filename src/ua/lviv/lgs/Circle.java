package ua.lviv.lgs;

public class Circle {
    int radius;
    int diameter;

    public Circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public void circleArea() {
        double area1 = diameter * diameter / 4 * Math.PI;
        System.out.println("Площа кола = " + area1);
    }

    public void circleLength() {
        double length1 = 2 * Math.PI * radius;
        System.out.println("Довжина кола = " + length1);
    }


}
