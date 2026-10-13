//Aim:
To write a Java applet program to demonstrate the use of BorderLayout for arranging buttons and a text area in the North, South, East, West, and Center regions.

//Algorithm:
Start the program.
Import the java.awt and java.applet packages.
Create an applet class named insertdemo.
Override the init() method.
Set the background color to cyan.
Set the layout manager to BorderLayout.
Add buttons to the North, South, East, and West regions.
Create a TextArea and add it to the Center region with the specified message.
Override the getInsets() method to set a 10-pixel margin on all sides.
Execute the applet to display the components.
Stop the program.

//program:
import java.awt.*;
import java.applet.*;

 /*
<applet code="insertdemo" width=400 height=200>
</applet>
*/

public class insertdemo extends Applet {
    public void init() {
        setBackground(Color.cyan);
        setLayout(new BorderLayout());

        add(new Button("this is cross the top"), BorderLayout.NORTH);
        add(new Button("the footer messsage might go here"), BorderLayout.SOUTH);
        add(new Button("RIGHT"), BorderLayout.EAST);
        add(new Button("LEFT"), BorderLayout.WEST);

        String msg = "the reasonable man adapts\n\n";
        add(new TextArea(msg), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return new Insets(10, 10, 10, 10);
    }
}

//Result:
Thus, the Java applet program demonstrating the BorderLayout layout manager was written successfully. The buttons are displayed in the North, South, East, and West regions, and the text area is displayed in the Center region with a cyan background.
