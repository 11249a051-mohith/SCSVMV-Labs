//Aim:
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, and division using separate classes and methods.

//Algorithm:
Start the program.
Import the Scanner class.
Create four static inner classes: Add, Sub, Mul, and Div.
Define the addop() method in the Add class to perform addition.
Define the subop() method in the Sub class to perform subtraction.
Define the mulop() method in the Mul class to perform multiplication.
Define the divop() method in the Div class to perform division.
Create objects for all four classes in the main() method.
Call each method with the values 20 and 10.
Display the results of all four arithmetic operations.
Stop the program.

    
//program:
import java.util.Scanner;
public class ArithmeticOperators {
    static class Add {
        void addop(int a, int b) {
            System.out.println("Add: " + (a + b));
        }
    }
    static class Sub {
        void subop(int a, int b) {
            System.out.println("Sub: " + (a - b));
        }
    }
    static class Mul {
        void mulop(int a, int b) {
            System.out.println("Mul: " + (a * b));
        }
    }
    static class Div {
        void divop(int a, int b) {
            System.out.println("Div: " + (a / b));
        }
    }
    public static void main(String[] args) {
        Add ad = new Add();
        Sub su = new Sub();
        Mul mu = new Mul();
        Div di = new Div();

        ad.addop(20, 10);
        su.subop(20, 10);
        mu.mulop(20, 10);
        di.divop(20, 10);
    }
}

//Result:
Thus, the Java program to perform addition, subtraction, multiplication, and division using separate classes and methods was executed successfully.
