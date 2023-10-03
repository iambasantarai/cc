package Unit2;

/*
    divide the window into 5 parts: north, south, east and west
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Border extends JFrame {
    JButton b1, b2, b3, b4;
    JTextArea t1;

    public  void setBorder() {
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");

        t1 = new JTextArea(20, 40);
        setVisible(true);
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add component into frame using border layout
        add(b1, BorderLayout.NORTH); // top
        add(b2, BorderLayout.EAST); // right
        add(b3, BorderLayout.SOUTH); // bottom
        add(b4, BorderLayout.WEST); // left
        add(t1, BorderLayout.CENTER); // middle

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("NORTH button is clicked.");
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("EAST button is clicked.");
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("SOUTH button is clicked.");
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("WEST button is clicked.");
            }
        });
    }
}

public class DemoBorderLayout {
    public static void main(String[] args) {
        Border b = new Border();
        b.setBorder();
    }
}
