//Aim:
To write a Java program to calculate the area and perimeter of a square, circle, and triangle using classes, constructors, and methods.

//Algorithm:
Start the program.
Create a Square class with a constructor to initialize the side.
Define methods to calculate the area and perimeter of the square.
Create a Circle class with a constructor to initialize the radius.
Define methods to calculate the area and perimeter of the circle.
Create a Triangle class with a constructor to initialize the three sides.
Define methods to calculate the perimeter and area of the triangle using Heron's formula.
In the main() method, read the side of the square and calculate its area and perimeter.
Read the radius of the circle and calculate its area and perimeter.
Read the three sides of the triangle and calculate its area and perimeter.
Display the results for all three shapes.
Close the scanner.
Stop the program.
    
    
//program:    
import java.util.Scanner;
class Circle {
    int radius;
    Circle(int r) {
        radius = r;
    }
    double perimeter() {
        return 2 * 3.14 * radius;
    }
    double area() {
        return 3.14 * radius * radius;
    }
}
class Square {
    int side;
    Square(int s) {
        side = s;
    }
    int perimeter() {
        return 4 * side;
    }
    int area() {
        return side * side;
    }
}
class Triangle {
    int side1, side2, side3;
    Triangle(int s1, int s2, int s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    int perimeter() {
        return side1 + side2 + side3;
    }
    double area() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
public class perimeterandarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Square: ");
        int s = sc.nextInt();
        Square sq = new Square(s);
        System.out.println("Perimeter of Square is " + sq.perimeter());
        System.out.println("Area of Square is " + sq.area());
        System.out.print("Enter the radius of the Circle: ");
        int r = sc.nextInt();
        Circle ci = new Circle(r);
        System.out.println("Perimeter of Circle is " + ci.perimeter());
        System.out.println("Area of Circle is " + ci.area());
        System.out.print("Enter the Side1 of the Triangle: ");
        int s1 = sc.nextInt();
        System.out.print("Enter the Side2 of the Triangle: ");
        int s2 = sc.nextInt();
        System.out.print("Enter the Side3 of the Triangle: ");
        int s3 = sc.nextInt();
        Triangle t = new Triangle(s1, s2, s3);
        System.out.println("Perimeter of Triangle is " + t.perimeter());
        System.out.println("Area of Triangle is " + t.area());
        sc.close();
    }
}


//Result:
Thus, the Java program to calculate the area and perimeter of a square, circle, and triangle using classes, constructors, and methods was executed successfully.
