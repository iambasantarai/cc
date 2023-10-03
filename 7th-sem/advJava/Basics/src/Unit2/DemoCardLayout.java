package Unit2;

/*
    - place the component as a sequence of card i.e. one component in place
    behind another and only one component is shown at a time
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class   Cards extends JFrame {
    JButton b1, b2, b3, b4;
    JPanel p1;

    public void setCards() {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        p1 = new JPanel();

        CardLayout c1 = new CardLayout();
        p1.setLayout(c1);
        // add panel into window (JFrame)
        add(p1);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add components
        p1.add(b1, "btn1");
        p1.add(b2, "btn2");
        p1.add(b3, "btn3");
        p1.add(b4, "btn4");

        // show next component
        // c1.next(p1);

        // show previous component
        // c1.previous(p1);

        // show component of own choice
        c1.show(p1, "btn3");
    }
}

public class DemoCardLayout {
    public static void main(String[] args) {
        Cards c = new Cards();
        c.setCards();
    }
}
