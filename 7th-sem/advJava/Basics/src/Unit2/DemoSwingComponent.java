package Unit2;
import javax.swing.*;
import java.awt.*;

class SwingControls extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField p1, p2;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JButton b1;

    public void setControls() {
        // labels
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("Confirm Password");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Course");

        // text fields
        t1 = new JTextField(20);

        // password fields
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);

        // radio buttons
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        // checkboxes
        c1  = new JCheckBox("JAVA");
        c2  = new JCheckBox("PHP");
        c3  = new JCheckBox("RUST");

        // button
        b1 = new JButton("Submit");

        // add button group for radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);

        // add components to window
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(b1);

        // add features to window
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());

        // if cancel button is pressed then program is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class DemoSwingComponent {
    public static void main(String[] args) {
        SwingControls sc = new SwingControls();
        sc.setControls();
    }
}
