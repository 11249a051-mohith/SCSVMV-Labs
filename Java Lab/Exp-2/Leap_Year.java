//Aim:
To write a Java program to check whether a given year is a leap year or not using conditional statements.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read the year from the user.
Initialize a boolean variable flag to false.
Check whether the year is divisible by 400. If true, set flag to true.
Otherwise, check whether the year is divisible by 100. If true, set flag to false.
Otherwise, check whether the year is divisible by 4. If true, set flag to true.
If none of the above conditions is satisfied, keep flag as false.
If flag is true, display that the year is a leap year; otherwise, display that it is not a leap year.
Close the scanner.
Stop the program.


//program:
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = s.nextInt();
        boolean flag = false;
        if (year % 400 == 0) {
            flag = true;
        }
        else if (year % 100 == 0) {
            flag = false;
        }
        else if (year % 4 == 0) {
            flag = true;
        }
        else {
            flag = false;
        }
        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        }
        else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
        s.close();
    }
}

//Result:
Thus, the Java program to check whether a given year is a leap year or not was executed successfully.
