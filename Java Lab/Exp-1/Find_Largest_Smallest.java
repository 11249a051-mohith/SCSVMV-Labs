//Aim:
To write a Java program to find the sum, largest number, and smallest number in a given array.

//Algorithm:
Start the program.
Initialize an array with the given elements.
Initialize sum, min, and max with the first element of the array.
Traverse the array from the second element to the last element.
If the current element is greater than max, update max.
If the current element is smaller than min, update min.
Add the current element to sum.
Display the sum, largest number, and smallest number.
Stop the program.

//program:
public class LargestSmallest {
    public static void main(String[] args) {
        int a[] = new int[] {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};
        int sum = a[0];
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            sum = sum + a[i];
        }
        System.out.println("The sum is : " + sum);
        System.out.println("Largest Number in a given array is : " + max);
        System.out.println("Smallest Number in a given array is : " + min);
    }
}

//Result:
Thus, the Java program to find the sum, largest number, and smallest number in a given array was executed successfully.
