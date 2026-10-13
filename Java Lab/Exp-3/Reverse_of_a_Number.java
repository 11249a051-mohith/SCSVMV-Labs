//Aim:
To write a Java program to reverse a given integer using a while loop.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Declare integer variables n and reverse, and initialize reverse = 0.
Read an integer n from the user.
Repeat while n is not equal to 0:
Extract the last digit using n % 10.
Add the digit to the reversed number using reverse = reverse * 10 + n % 10.
Remove the last digit using n = n / 10.
Display the reversed number.
Close the scanner.
Stop the program.


//program:
import java.util.Scanner;
class Reversenumber {
    public static void main(String args[]) {
        int n, reverse = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        n = in.nextInt();
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reverse of the number is " + reverse);
        in.close();
    }
}

//Result:
Thus, the Java program to reverse a given integer using a while loop was executed successfully.
