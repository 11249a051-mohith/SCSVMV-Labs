//Aim:
To write a Java program to find the largest of three integers using the if-else-if statement.

//Algorithm:
Start the program.
Import the Scanner class to get input from the user.
Declare three integer variables x, y, and z.
Read three integers from the user.
Compare the three numbers using if-else-if statements.
If x is greater than both y and z, display “First number is largest.”
Else, if y is greater than both x and z, display “Second number is largest.”
Else, if z is greater than both x and y, display “Third number is largest.”
Otherwise, display “The numbers are not distinct.”
Close the scanner.
Stop the program


//program:
import java.util.Scanner;
class LargestOfThreeNumbers {
    public static void main(String args[]) {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x > y && x > z) {
            System.out.println("First number is largest.");
        }
        else if (y > x && y > z) {
            System.out.println("Second number is largest.");
        }
        else if (z > x && z > y) {
            System.out.println("Third number is largest.");
        }
        else {
            System.out.println("The numbers are not distinct.");
        }
        in.close();
    }
}

//Result:
Thus, the Java program to find the largest of three integers using the if-else-if statement was executed successfully.
