//Aim:
To write a Java program to print the multiplication table of a given number using a for loop.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read an integer no from the user.
Display the multiplication table heading.
Use a for loop from 1 to 10.
Multiply the given number by each value from 1 to 10.
Display the multiplication table in the format no * i = result.
Close the scanner.
Stop the program.

//program:
import java.util.Scanner;
public class MulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        System.out.println("Multiplication Table of " + no);
        for (int i = 0; i < 10; i++) {
            System.out.println(no + " * " + (i + 1) + " = " + (no * (i + 1)));
        }
        sc.close();
    }
}

//Result:
Thus, the Java program to print the multiplication table of a given number was executed successfully.
