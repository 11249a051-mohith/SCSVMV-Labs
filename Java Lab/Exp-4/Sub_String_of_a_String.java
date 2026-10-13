//Aim:
To write a Java program to display all possible substrings of a given string and count the total number of substrings.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read a string from the user.
Find the length of the string using the length() method.
Initialize the substring count variable n to 0.
Use an outer for loop to select each character position in the string.
Use an inner for loop to generate all possible substrings starting from that position.
Extract each substring using the substring() method.
Display each substring and increment the count by 1.
Display the total number of substrings.
Close the scanner.
Stop the program.


//program
import java.util.Scanner;
class SubstringsOfAString {
    public static void main(String args[]) {
        String string, sub;
        int n = 0;
        int length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print all its substrings:");
        string = in.nextLine();
        length = string.length();
        System.out.println("Substrings of \"" + string + "\" are:");
        for (int c = 0; c < length; c++) {
            for (int i = 1; i <= length - c; i++) {
                sub = string.substring(c, c + i);
                System.out.println(sub);
                n++;
            }
        }
        System.out.println("No of substrings present are: " + n);
        in.close();
    }
}

//Result:
Thus, the Java program to display all possible substrings of a given string and count the total number of substrings was executed successfully.
