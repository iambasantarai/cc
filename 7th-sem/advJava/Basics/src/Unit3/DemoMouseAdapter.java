// using delegation event (using listener) we have to implement all the methods they are required or not
// using adaptor class we can implement any method according to our needs i.e. we don't have to implement all the methods

package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseAdapters extends JFrame {
    JTextField t1, t2;
    JLabel l1;

    public  void setMouseAdapters() {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l1 = new JLabel("Result");

        // handling mouse event using adapter in t1
        t1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                l1.setText("Mouse is released.");
            }
        });
        // handling mousemotion event using adapter in t2
        t2.addMouseMotionListener(new MouseMotionAdapter() {
            // it contains 2 methods but we can use any of them
            @Override
            public void mouseDragged(MouseEvent e) {
                l1.setText("Mouse is dragged.");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                l1.setText("Mouse is moved.");
            }
        });

        add(t1);
        add(l1);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class DemoMouseAdapter {
    public static void main(String[] args) {
        MouseAdapters ma = new MouseAdapters();
        ma.setMouseAdapters();
    }
}
