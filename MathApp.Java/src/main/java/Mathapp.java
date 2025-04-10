import java.util.Random;

public class Mathapp {

    public static void main(String[] args) {
        // 2. Find and display the smallest of two variables
        double carPrice = 25000;
        double truckPrice = 33000;
        System.out.println("Smallest price: " + Math.min(carPrice, truckPrice));

        // 3. Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle: " + area);

// 4. Find and display the square root of a variable after it is set to 5.0
        double value = 5.0;
        System.out.println("Square root: " + Math.sqrt(value));

        // 5. Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between points: " + distance);

        // 6. Find and display the absolute value of a variable after it is set to -3.8
        double num = -3.8;
        System.out.println("Absolute value: " + Math.abs(num));



    }

}