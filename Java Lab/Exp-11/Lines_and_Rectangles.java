//Experiment: Drawing Lines and Rectangles Using Java Graphics

//Aim:
To develop a Java program to draw lines, rectangles, filled rectangles, and rounded rectangles using AWT graphics and Swing components.

//Algorithm:
1. Import the required AWT and Swing packages.
2. Create a class named `LineAndRectangleUsingApplet` that extends `JPanel`.
3. Override the `paintComponent()` method to draw graphics.
4. Use `drawLine()` to display straight and intersecting lines.
5. Use `drawRect()` to draw an outline rectangle.
6. Use `fillRect()` to draw a solid rectangle.
7. Use `drawRoundRect()` to draw a rounded rectangle.
8. Use `fillRoundRect()` to draw a filled rounded rectangle.
9. Create a `JFrame` and add the panel to it.
10. Set the window size and display the frame.


//program:
import java.awt.*;
import javax.swing.*;

public class LineAndRectangleUsingApplet extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a line
        g.drawLine(10, 10, 50, 50);

        // Draw a rectangle
        g.drawRect(10, 60, 40, 30);

        // Fill a rectangle
        g.fillRect(60, 10, 30, 80);

        // Draw a rounded rectangle
        g.drawRoundRect(10, 100, 80, 50, 10, 10);

        // Fill a rounded rectangle
        g.fillRoundRect(20, 110, 60, 30, 5, 5);

        // Draw crossing lines
        g.drawLine(100, 10, 230, 170);
        g.drawLine(100, 170, 230, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lines and Rectangles");
        LineAndRectangleUsingApplet panel =
                new LineAndRectangleUsingApplet();

        frame.add(panel);
        frame.setSize(280, 230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


//Sample Output:
A window titled “Lines and Rectangles” appears, showing straight lines, an outline rectangle, a filled rectangle, an outline rounded rectangle, a filled rounded rectangle, and two intersecting lines.

//Result:
Thus, the Java program for drawing lines, rectangles, and rounded rectangles using AWT graphics methods and Swing components was implemented successfully.
