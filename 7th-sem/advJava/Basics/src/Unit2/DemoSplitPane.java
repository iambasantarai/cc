package Unit2;
import javax.swing.*;
import java.awt.*;

/*
    Divide the content into two part with slider
 */

class Splits extends JFrame {
    JComboBox cb1;
    JTextField t1;
    JPanel p1, p2;

    public void setSplit() {
        String [] country = {"Mimi", "Bhunte"};
        cb1 = new JComboBox(country);
        t1 = new JTextField("Mitakshya's pets");
        p1 = new JPanel();
        p2 = new JPanel();

        p1.add(cb1);
        p2.add(t1);

        // create split pane
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);

        // to collapse and release component
        sp.setOneTouchExpandable(true);

        // maintain gap
        sp.setDividerSize(50);
        add(sp);


        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class DemoSplitPane {
    public static void main(String[] args) {
        Splits s = new Splits();
        s.setSplit();
    }
}
