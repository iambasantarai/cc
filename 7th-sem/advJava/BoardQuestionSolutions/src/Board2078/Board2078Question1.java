package Board2078;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ques1 {
    JTextField t1, t2;
    JLabel l1, l2, l3;

    JFrame jf;

    public void setQues1() {
        jf = new JFrame();
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l1 = new JLabel("Enter first number: ");
        l2 = new JLabel("Enter second number: ");
        l3 = new JLabel("Result: ");

        jf.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                l3.setText("Sum is: " + sum);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int difference = num1 - num2;
                l3.setText("Difference is: " + difference);
            }
        });

        jf.add(l1);jf.add(t1);
        jf.add(l2);jf.add(t2);
        jf.add(l3);

        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class Board2078Question1 {
    public static void main(String[] args) {
        Ques1 q1 = new Ques1();
        q1.setQues1();
    }
}
