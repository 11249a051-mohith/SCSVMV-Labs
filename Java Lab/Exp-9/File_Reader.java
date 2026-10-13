//Aim:
To write a Java program to read and display the contents of a text file (sample2.txt) using the FileReader class.

//Algorithm:
Start the program.
Create a FileReader object to open the file sample2.txt.
Declare an integer variable i to store each character read from the file.
Read characters from the file using the read() method until the end of the file (-1) is reached.
Display each character using System.out.print().
Close the file using the close() method.
Handle exceptions using the catch block.
Stop the program.

//program:
import java.io.*;
class Filereader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample2.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

//Result:
Thus, the Java program to read and display the contents of a text file using the FileReader class was executed successfully.
