import java.awt.*;
import java.awt.event.*;

class ConcentricRings extends Frame {

  public ConcentricRings ( ) {
    setTitle ("Olympic Rings");
  }

  public static void main (String [ ] args) {
    // Create a graphics frame of the
    // given size and show the drawing
    // outlined in the paint method.

    Frame f = new ConcentricRings ();
    f.setSize (300, 200);
    f.setVisible (true);

    // Add functionality for closing the window
    f.addWindowListener(new WindowAdapter () {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  public void paint (Graphics g) {
    // Draw five interlocking rings
    // of different colours.

    g.setColor (Color.red);
    g.drawOval (80,60,40,40);
    g.drawOval (90,70,20,20);
    g.setColor (Color.blue);
    g.drawOval (105,80,40,40);
    g.drawOval (115,90,20,20);
    g.setColor (Color.green);
    g.drawOval (130,60,40,40);
    g.drawOval (140,70,20,20);
    g.setColor (Color.yellow);
    g.drawOval (155,80,40,40);
    g.drawOval (165,90,20,20);
    g.setColor (Color.black);
    g.drawOval (180,60,40,40);
    g.drawOval (190,70,20,20);

    // Label the drawing
    g.drawString("Olympic Rings", 110,140);
  }
}
