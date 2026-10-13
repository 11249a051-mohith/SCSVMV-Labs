//Aim:
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus using a menu-driven program and a switch statement.
    
//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read two integer numbers.
Display the menu of arithmetic operations:
Addition,Subtraction,Multiplication,Division,Modulus
Exit
Read the user's choice.
Use a switch statement to perform the selected operation.
For division and modulus, check whether the second number is zero before performing the operation.
Display the result of the selected operation.
If the user chooses 6, display “Exiting...” and terminate the program.
If an invalid choice is entered, display an error message.
Repeat the process until the user chooses to exit.
Stop the program.


//program:
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Enter the two numbers to perform operations");
            System.out.print("Enter the first number: ");
            int x = s.nextInt();
            System.out.print("Enter the second number: ");
            int y = s.nextInt();
            System.out.println("\nChoose the operation you want to perform");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;
                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;
                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;
                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                case 5:
                    if (y != 0) {
                        int mod = x % y;
                        System.out.println("Result: " + mod);
                    } else {
                        System.out.println("Cannot find modulus with zero.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    s.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1 to 6.");
            }
        }
    }
}

//Result:
Thus, the Java program to perform arithmetic operations using a menu-driven approach and a switch statement was executed successfully.
