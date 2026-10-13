//Aim:
To write a Java program to replace a specified substring in a given string using the replace() method.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read a string from the user.
Read the substring to be replaced and the new substring.
Use the replace() method to replace the specified substring with the new substring.
Store the modified string in the variable replaceString.
Display the string after replacement.
Close the scanner.
Stop the program.

//program:
import java.util.*;
public class Replace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the variable to be replaced and the variable that replaces it:");
        String a = sc.next();
        String e = sc.next();
        String replaceString = s1.replace(a, e);
        System.out.println("After replacement: " + replaceString);
        sc.close();
    }
}

//Result:
Thus, the Java program to replace a specified substring in a given string using the replace() method was executed successfully.
