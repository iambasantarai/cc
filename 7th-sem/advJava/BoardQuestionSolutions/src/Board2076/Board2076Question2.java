package Board2076;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ques2 extends  JFrame{
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;

    public void setQuestion2() {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        l1 = new JLabel("Enter first number: ");
        l2 = new JLabel("Enter second number: ");
        l3 = new JLabel("Result: ");

        t3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                t3.setText("Sum is: " + (num1 + num2));
            }
        });

        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);

        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Board2076Question2 {

    public static void main(String[] args) {
        Ques2 q2 = new Ques2();
        q2.setQuestion2();
    }
}
