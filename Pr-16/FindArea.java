// 16.Write a Java program to create a method named findArea(double radius) with return type double that calculates and returns the area of a circle, then store the result and display it.
public class FindArea {
    static double findArea(double radius) {
        final double PI_VALUE = 3.141;
        double area_of_circle = PI_VALUE * (radius * radius);
        return area_of_circle;
    }

    public static void main(String[] args) {
        double radius = 15.25;
        double res = FindArea.findArea(radius);

        System.out.println("Area of Cicle with Radius " + radius + " is: " + Math.round(res));
    }
}