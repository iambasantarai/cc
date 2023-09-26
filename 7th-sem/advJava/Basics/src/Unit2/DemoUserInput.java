package Unit2;
import javax.swing.*; // for swing component
import java.awt.*; // for awt component
import java.awt.event.*; // for event handling

class UserInput extends JFrame {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3;

    public void setInput() {
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter second number");
        l3 = new JLabel("Result");

        t1 = new JTextField(15);
        t2 = new JTextField(15);

        b1 = new JButton("SUM");
        b2 = new JButton("MULTIPLY");
        b3 = new JButton("DIVISION");

        // add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(b1); add(b2); add(b3); add(l3);

        // add window specification
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // handle events generated from buttons

        // for sum
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                l3.setText("RESULT OF SUM : " + sum);
            }
        });

        // for multiply
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int mul = num1 * num2;
                l3.setText("RESULT OF MULTIPLY : " + mul);
            }
        });

        // for division
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int div = num1 / num2;
                l3.setText("RESULT OF DIVISION : " + div);
            }
        });
    }
}
public class DemoUserInput {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        ui.setInput();
    }
}
