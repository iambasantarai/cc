package Unit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DropdownComponent extends JFrame {
    JComboBox cb1;
    JLabel l1;
    public void setComponents(){
        String []country={"Nepal", "India", "China"};
        cb1=new JComboBox(country);
        l1=new JLabel("RESULT: ");
        add(cb1);
        add(l1);
        setLayout(new FlowLayout());
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String item=(String)cb1.getSelectedItem();
                l1.setText("You Selected: " + item);
            }
        });
    }

}

public class DemoDropdownComponent {
    public static void main(String[] args) {
        DropdownComponent dc=new DropdownComponent();
        dc.setComponents();
    }
}
