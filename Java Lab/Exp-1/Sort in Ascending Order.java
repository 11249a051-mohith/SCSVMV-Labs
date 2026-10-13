//Aim:
To write a Java program to sort the given array elements in ascending order using nested for loops and swapping.

//Algorithm:
Start the program.
Import the Scanner class to read input from the user.
Read the number of elements to be stored in the array.
Declare an array of the specified size.
Read all the elements into the array.
If the current element is greater than the compared element, swap their values using a temporary variable.
Repeat the process until all elements are sorted in ascending order.
Display the sorted array.
Close the scanner 
stop the program.

    
//program:
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        // Sorting in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) {
                System.out.print(",");
            }
        }
        s.close();
    }
}

//Result:
Thus, the Java program to sort the elements of an array in ascending order was executed successfully.
