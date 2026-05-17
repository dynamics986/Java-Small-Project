import java.awt.*;
import java.awt.event.*;

class Rings extends Frame {

  /* The Olympic Rings program  by J M Bishop
   * Illustrates colour and simple graphic output.
   */

  public Rings ( ) {
    setTitle ("Olympic Rings");
  }

  public static void main (String [ ] args) {
    // Create a graphics frame of the
    // given size and show the drawing
    // outlined in the paint method.

    Frame f = new Rings ();
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
    g.drawOval (80,80,30,30);
    g.setColor (Color.blue);
    g.drawOval (105,80,30,30);
    g.setColor (Color.green);
    g.drawOval (130,80,30,30);
    g.setColor (Color.yellow);
    g.drawOval (155,80,30,30);
    g.setColor (Color.black);
    g.drawOval (180,80,30,30);

    // Label the drawing
    g.drawString("Olympic Rings", 110,140);
  }

}


