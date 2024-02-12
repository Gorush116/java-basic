package oop1.ex;

public class RectangleOopMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calculateArea(rectangle.width, rectangle.height);
        System.out.println("area = " + area);

        int perimeter = rectangle.calculatePerimeter(rectangle.width, rectangle.height);
        System.out.println("perimeter = " + perimeter);

        boolean flag = rectangle.isSquare(rectangle.width, rectangle.height);
        System.out.println("flag = " + flag);

    }
}
