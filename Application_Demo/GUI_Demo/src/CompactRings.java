
import java.awt.*;    // import Java packages
import java.awt.event.*;

class CompactRings extends Frame {

    public CompactRings() {
        setTitle("Olympic Rings");   // the window title bar
    }

    public static void main(String[] args) {
        Frame f = new CompactRings();
        f.setSize(300, 200);   // window dimensions
        f.setVisible(true);    // show the window

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(80, 80, 30, 30); // the rings
        g.setColor(Color.blue);
        g.drawOval(105, 80, 30, 30);
        g.setColor(Color.green);
        g.drawOval(130, 80, 30, 30);
        g.setColor(Color.yellow);
        g.drawOval(155, 80, 30, 30);
        g.setColor(Color.black);
        g.drawOval(180, 80, 30, 30);
        g.drawString("Olympic Rings", 110, 140);             // the text
    }
}
