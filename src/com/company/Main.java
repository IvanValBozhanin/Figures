package com.company;

public class Main {

    public static void main(String[] args) {
//        testSquare();
//        testRectangle();
//        testCircle();
        testComparableSquares();
    }

    private static void testComparableSquares() {
        ComparableSquare square1 = new ComparableSquare(0,0, 1,0, 1,1, 0, 1);
        ComparableSquare square2 = new ComparableSquare(0, 0, 2, 0, 2, 2, 0 ,2 );

        System.out.println(square1.compareTo(square2) > 0 ? "square1 is bigger than square2" :
                (square1.compareTo(square2) < 0 ? "square2 is bigger than square1" :
                        "square1 has the same surface as square2"));
    }

    public static void testSquare(){
        Square square = new Square(0,0, 1,0, 1,1, 0, 1);
        System.out.println("square perimeter: " + square.perimeter());
        System.out.println("square surface: " + square.surface());
        square.info();

        Square square1 = new Square(square);
        System.out.println("square1 perimeter: " + square1.perimeter());
        System.out.println("square1 surface: " + square1.surface());
        square1.info();
    }

    public static void testRectangle(){
        Rectangle rectangle = new Rectangle(0,0, 5,0, 5,2, 0, 2);
        System.out.println("rectangle perimeter: " + rectangle.perimeter());
        System.out.println("rectangle surface: " + rectangle.surface());
        rectangle.info();

        Rectangle rectangle1 = new Rectangle(rectangle);
        System.out.println("rectangle1 perimeter: " + rectangle1.perimeter());
        System.out.println("rectangle1 surface: " + rectangle1.surface());
        rectangle1.info();
    }

    public static void testCircle(){
        Circle circle = new Circle(0, 0, 7);
        System.out.println("circle perimeter: " + circle.perimeter());
        System.out.println("circle surface: " + circle.surface());
        circle.info();

        Circle circle1 = new Circle(circle);
        System.out.println("circle1 perimeter: " + circle1.perimeter());
        System.out.println("circle1 surface: " + circle1.surface());
        circle1.info();
    }
}
