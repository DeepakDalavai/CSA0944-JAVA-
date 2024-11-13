abstract class Shape {
    protected double area;
    protected double perimeter;

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    public void displayDetails() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    public void displayCircleDetails() {
        System.out.println("Circle:");
        calculateArea();
        calculatePerimeter();
        displayDetails();
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    public void displayRectangleDetails() {
        System.out.println("Rectangle:");
        calculateArea();
        calculatePerimeter();
        displayDetails();
    }
}

public class R192210646 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 7.0);

        System.out.println("Circle Details:");
        ((Circle) circle).displayCircleDetails();
        
        System.out.println("\nRectangle Details:");
        ((Rectangle) rectangle).displayRectangleDetails();
    }
}
