//Aim:
To write a Java program to check whether a given integer is a perfect number or not.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Declare integer variables n and sum, and initialize sum = 0.
Read an integer n from the user.
Use a for loop from 1 to n - 1.
Check whether n is divisible by i using n % i == 0.
If it is divisible, add i to sum.
After the loop, check whether sum == n and n > 0.
If both conditions are true, display “Given number is Perfect”.
Otherwise, display “Given number is not Perfect”.
Close the scanner.
Stop the program.


//program:
import java.util.Scanner;
public class Perfectnumber {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check: ");
        n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n && n > 0) {
            System.out.println("Given number is Perfect");
        }
        else {
            System.out.println("Given number is not Perfect");
        }
        s.close();
    }
}

//Result:
Thus, the Java program to check whether a given integer is a perfect number or not was executed successfully.
