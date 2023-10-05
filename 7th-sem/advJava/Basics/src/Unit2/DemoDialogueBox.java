package Unit2;
/*
    - It is a popup box that appears to show warning message or normal message
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Dialogs {
    public void setDialogue() {
        JFrame jf = new JFrame();
        // for normal message
        // JOptionPane.showMessageDialog(jf, "Oh, hello there!");

        // warning message
        // JOptionPane.showMessageDialog(jf, "Oops! Error", "Warning", JOptionPane.WARNING_MESSAGE);

        // take input
        // JOptionPane.showInputDialog(jf, "Enter Name: ");

        // confirm
        // JOptionPane.showConfirmDialog(jf,"Are you sure?");


        // use JDialog
        JButton b1 = new JButton("Click Me");
        jf.add(b1);
        jf.setVisible(true);
        jf.setSize(400, 400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog jd = new JDialog(jf, "Clicked");
                jd.setVisible(true);
                jd.setSize(200,200);
                jd.add(new JLabel("You clicked me!"));
                jd.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
            }
        });
    }
}

public class DemoDialogueBox {
    public static void main(String[] args) {
        Dialogs d = new Dialogs();
        d.setDialogue();
    }
}
