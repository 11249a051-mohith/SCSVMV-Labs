//Experiment: Human Face Using Java Graphics

//Aim:
To write a Java program to draw a human face using Java Swing
and AWT graphics methods.

//Algorithm:
1. Import the required AWT and Swing packages.
2. Create a class named HumanFaceUsingApplet that extends JPanel.
3. Override the paintComponent() method.
4. Use drawOval() to draw the face, eyes, and ears.
5. Use fillOval() to draw the pupils.
6. Use drawOval() to draw the nose.
7. Use drawArc() to draw the mouth.
8. Create a JFrame and add the panel to it.
9. Set the frame size and make it visible.

//program:
import java.awt.*;
import javax.swing.*;
public class HumanFaceUsingApplet extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw face
        g.drawOval(40, 40, 120, 150);
        // Draw eyes
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);
        // Draw pupils
        g.fillOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);
        // Draw nose
        g.drawOval(85, 100, 30, 30);
        // Draw mouth
        g.drawArc(60, 125, 80, 40, 180, 180);
        // Draw ears
        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        HumanFaceUsingApplet face = new HumanFaceUsingApplet();
        frame.add(face);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


//Sample Output:
A window titled "Human Face" appears with a face containing
a head, two eyes, pupils, a nose, a mouth, and two ears.

//Result:
Thus, the Java program to draw a human face using Swing
and AWT graphics methods was written and executed successfully.
