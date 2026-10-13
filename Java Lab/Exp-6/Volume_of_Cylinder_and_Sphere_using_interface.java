//Aim:
To write a Java program using interfaces to calculate the volume of a cylinder and a sphere.
    
//Algorithm:
Start the program.
Declare interfaces Shape and CylinderShape.
Implement the interfaces in Sphere and Cylinder classes.
Read radius and height from the user.
Calculate and display both volumes.
Stop the program.

//program:
import java.util.Scanner;
interface Shape {
    double volume(double r);
}
interface CylinderShape {
    double volume(double r, double h);
}
class Cylinder implements CylinderShape {
    public double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
}

class Sphere implements Shape {
    public double volume(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}
public class Volumeinterface  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        Cylinder c = new Cylinder();
        Sphere s = new Sphere();
        System.out.printf("Volume of Cylinder: %.2f%n", c.volume(r, h));
        System.out.printf("Volume of Sphere: %.2f%n", s.volume(r));
        sc.close();
    }
}

//Result:
The Java program was executed successfully. It calculates and displays the volumes of a cylinder and a sphere using interfaces.
