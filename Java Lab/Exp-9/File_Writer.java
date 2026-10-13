//Aim:
To write a Java program to write uppercase alphabets (A–Z) into a text file (sample2.txt) using the FileWriter class.
    
//Algorithm:
Start the program.
Create a FileWriter object to open sample2.txt.
Use a for loop with a character variable i starting from ASCII value 65 (A) and continuing until 90 (Z).
Write each character into the file using the write() method.
Close the file using the close() method.
Display the message "Data written successfully.".
Handle exceptions using the catch block.
Stop the program.

//program:
import java.io.*;
class Filewriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample2.txt");

            for (char i = 65; i < 91; i++) {
                fw.write(i);
            }

            fw.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

//Result:
Thus, the Java program to write uppercase alphabets (A–Z) into the file sample2.txt using the FileWriter class was executed successfully.
