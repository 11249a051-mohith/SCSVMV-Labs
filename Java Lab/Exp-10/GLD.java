//Aim:
To write a Java applet program to demonstrate the GridLayout layout manager by arranging ten buttons in five rows and two columns.

//Algorithm:
Start the program.
Import the java.awt and java.applet packages.
Create an applet class named gld.
Override the init() method.
Set the layout manager to GridLayout(5, 2), specifying five rows and two columns.
Create ten buttons labeled A, B, C, D, E, F, G, H, I, and J.
Add all ten buttons to the applet.
Override the getInsets() method to set a 20-pixel margin on all sides.
Execute the applet to display the buttons in a grid format.
Stop the program


//program:
import java.awt.*;
import java.applet.*;
public class gld extends Applet {
    public void init() {
        setLayout(new GridLayout(5, 2));
        Button b1 = new Button("A");
        Button b2 = new Button("B");
        Button b3 = new Button("C");
        Button b4 = new Button("D");
        Button b5 = new Button("E");
        Button b6 = new Button("F");
        Button b7 = new Button("G");
        Button b8 = new Button("H");
        Button b9 = new Button("I");
        Button b10 = new Button("J");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }
    public Insets getInsets() {
        return new Insets(20, 20, 20, 20);
    }
}

//Result:
Thus, the Java applet program demonstrating the GridLayout layout manager was written and executed successfully.
