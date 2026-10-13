//Aim:
To write a Java program to demonstrate inheritance and interface implementation by calculating and displaying a student's details and percentage of marks.

//Algorithm
Start the program.
Declare an interface Exam with the method percent_cal().
Create a class Student with data members for name, roll number, and marks of two subjects.
Initialize the student details using a parameterized constructor.
Define the display() method to print the student's details and marks.
Create a class Result that extends Student and implements the Exam interface.
Use the super() keyword to initialize the student details through the parent class constructor.
Implement the percent_cal() method to calculate the total marks and percentage.
Create an object of the Result class in the main() method.
Display the student's details and calculate and display the percentage.
Stop the program

//program:
interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll_no, mark1, mark2;

    Student(String n, int r, int m1, int m2) {
        name = n;
        roll_no = r;
        mark1 = m1;
        mark2 = m2;
    }

    void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No. of Student: " + roll_no);
        System.out.println("Marks of Subject 1: " + mark1);
        System.out.println("Marks of Subject 2: " + mark2);
    }
}

class Result extends Student implements Exam {
    Result(String n, int r, int m1, int m2) {
        super(n, r, m1, m2);
    }

    public void percent_cal() {
        int total = mark1 + mark2;
        float percent = total * 100.0f / 200;
        System.out.println("Percentage: " + percent + "%");
    }
}
public class StuDetail {
    public static void main(String[] args) {
       Result R = new Result("jithu", 18, 93, 84);
        R.display();
        R.percent_cal();
    }
}

//Result:
The Java program was executed successfully. It displays the student's name, roll number, marks in two subjects, and the calculated percentage.
