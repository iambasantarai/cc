// generated when component gain or looses focus of keyboard
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Focus extends JFrame {
    JLabel l1;
    JButton b1, b2;

    public void setFocus() {
        l1 = new JLabel("Result");
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");

        add(l1);
        add(b1);
        add(b2);

        b1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                l1.setText("Button gained focus.");
            }

            @Override
            public void focusLost(FocusEvent e) {
                l1.setText("Button lost focus.");
            }
        });

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class DemoFocusEvent {
    public static void main(String[] args) {
        Focus f1 = new Focus();
        f1.setFocus();
    }
}
