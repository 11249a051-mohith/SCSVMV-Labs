//Aim:
To write a Java program to check whether a given positive number is an Armstrong number or not.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read a positive integer n from the user.
Store the original number in the variable nu and initialize num to 0.
Repeat while nu is not equal to 0:
Find the last digit using rem = nu % 10.
Calculate the cube of the digit and add it to num.
Remove the last digit using nu = nu / 10.
Compare the calculated sum num with the original number n.
If both are equal, display “Armstrong Number”.
Otherwise, display “Not an Armstrong Number”.
Close the scanner.
Stop the program


//program:
import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]) {
        int n, nu, num = 0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Positive Number: ");
        n = scan.nextInt();
        nu = n;
        while (nu != 0) {
            rem = nu % 10;
            num = num + rem * rem * rem;
            nu = nu / 10;
        }
        if (num == n) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
        scan.close();
    }
}

//Result:
Thus, the Java program to check whether a given positive number is an Armstrong number or not was executed successfully.
