package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Write a program using swing to find out simple interest .
     Use text field for input and output. Your program should display output when button is clicked.
 */

class SICalculator extends JFrame {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public void setSICalculator() {
        l1 = new JLabel("Principle: ");
        l2 = new JLabel("Time: ");
        l3 = new JLabel("Rate: ");
        l4 = new JLabel("Simple Interest: ");

        b1 = new JButton("Calculate");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1);
        add(l4); add(t4);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p = Integer.parseInt(t1.getText());
                int t = Integer.parseInt(t2.getText());
                int r = Integer.parseInt(t3.getText());

                // calculate interest
                int si = (p * t * r) / 100;
                t4.setText(String.valueOf(si));
            }
        });
    }
}

public class FindSimpleInterest {
    public static void main(String[] args) {
        SICalculator c = new SICalculator();
        c.setSICalculator();
    }
}
