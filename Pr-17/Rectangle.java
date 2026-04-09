// 17. Write a Java program to create two methods named findArea(int length, int breadth) and findPerimeter(int length, int breadth) with return type int to calculate the area and perimeter of a rectangle, then call both methods, store the results, and display them.
public class Rectangle {
    static int findArea(int length, int breadth) {
        int area = length * breadth;
        return area;
    }

    static int findPerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        return perimeter;
    }

    public static void main(String[] args) {
        int l = 10;
        int b = 5;
 
        int areaResult = findArea(l, b);
        int perimeterResult = findPerimeter(l, b);
 
        System.out.println("Rectangle Dimensions: " + l + " x " + b);
        System.out.println("----------------------------");
        System.out.println("Area of the Rectangle: " + areaResult);
        System.out.println("Perimeter of the Rectangle: " + perimeterResult);
    }
}