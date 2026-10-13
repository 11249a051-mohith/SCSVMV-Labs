//Aim:
To write a Java program to search for an element in an array using the Binary Search technique.
    
//Algorithm:
Start the program.
Import the Scanner class to get input from the user.
Read the number of elements in the array.
Read the array elements in ascending order.
Read the element to be searched.
Initialize first = 0 and last = n - 1.
Repeat while first <= last:
Calculate the middle position using mid = (first + last) / 2.
If a[mid] > x, set last = mid - 1.
If a[mid] < x, set first = mid + 1.
Otherwise, display “Element found”, set flag = 1, and stop searching.
If flag == 0, display “Element not found”.
Close the scanner.
Stop the program.

//program:
import java.util.Scanner;
class BinarySearch {
    public static void main(String ar[]) {
        int i, mid, first, last, x, n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for (i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        x = sc.nextInt();
        first = 0;
        last = n - 1;
        while (first <= last) {
            mid = (first + last) / 2;
            if (a[mid] > x) {
                last = mid - 1;
            } 
            else if (a[mid] < x) {
                first = mid + 1;
            } 
            else {
                flag = 1;
                System.out.println("Element found");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}

//Result:
Thus, the Java program to search for an element in an array using the Binary Search technique was executed successfully.
