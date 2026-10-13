//Aim:
To write a Java applet program to demonstrate the CardLayout layout manager, which displays one button at a time and switches to the next button when clicked.

//Algorithm:
Start the program.
Import the java.awt, java.applet, and java.awt.event packages.
Create an applet class named carddemo that implements the ActionListener interface.
Declare three buttons, a panel, and a CardLayout object.
Create a panel and add it to the applet.
Create a CardLayout object and set it as the layout manager for the panel.
Create three buttons: First Button, Second Button, and Third Button.
Register the action listener for each button.
Add the three buttons to the panel with their respective card names.
Override the actionPerformed() method to display the next card using buttonCardLayout.next(buttonPanel).
Execute the applet and click the buttons to switch between the cards.
Stop the program.


//program:
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class carddemo extends Applet implements ActionListener {
    Button b1, b2, b3;
    Panel buttonPanel;
    CardLayout buttonCardLayout;
    public void init() {
        buttonPanel = new Panel();
        add(buttonPanel);
        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);
        b1 = new Button("first Button");
        b1.addActionListener(this);
        buttonPanel.add(b1, "first Button");
        b2 = new Button("second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2, "second Button");
        b3 = new Button("third button");
        b3.addActionListener(this);
        buttonPanel.add(b3, "third Button");
    }
    public void actionPerformed(ActionEvent e) {
        buttonCardLayout.next(buttonPanel);
    }
}

//Result:
Thus, the Java applet program demonstrating the CardLayout layout manager was executed successfully. It displays one button at a time and switches to the next button whenever the currently displayed button is clicked.
