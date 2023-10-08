package Unit2;
/*
    Design GUI form using swing with text field label to display input message "Input any string"
    and three button with caption CheckPalindrome, Reverse, Find vowel
    If check palindrome is pressed check given string is palindrome or not and same for other show the result in text field.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StringManipulatorGUI extends JFrame {
    JLabel l1;
    JTextField t1,t2;
    JButton b1,b2,b3;

    public void setGUI() {
        l1 = new JLabel("Enter String: ");
        t1= new JTextField(10);
        t2= new JTextField(15);
        b1 = new JButton("Check Palindrome");
        b2 = new JButton("Reverse");
        b3 = new JButton("Find Vowel");

        add(l1);add(t1);
        add(b1);add(b2);add(b3);
        add(t2);

        // Check palindrome
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String input = t1.getText();
                String reverse = "";
                for(int i = (input.length() - 1); i >= 0; i--){
                    reverse = reverse + input.charAt(i);
                }
                if(input.equalsIgnoreCase(reverse)){
                    t2.setText("String is a Palindrome");
                }
                else{
                    t2.setText("String is not a Palindrome");
                }
            }
        });

        // reverse string
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String input = t1.getText();
                StringBuilder reverse = new StringBuilder();
                for(int i = (input.length()-1); i >= 0; i--){
                    reverse.append(input.charAt(i));
                }
                t2.setText(reverse.toString());
            }
        });

        // find vowels
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String []vowels ={"a", "e", "i","o","u"};
                String input = t1.getText();
                String result = "";
                for(int i = 0; i < (input.length()); i++){
                    if(input.charAt(i) == 'a' ||input.charAt(i) == 'e' || input.charAt(i) == 'i' ||input.charAt(i) == 'o' ||input.charAt(i) == 'u'){
                        result += input.charAt(i);
                        t2.setText(result);
                    }
                }
            }
        });

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class StringManipulation {
    public static void main(String[] args) {
        StringManipulatorGUI sm = new StringManipulatorGUI();
        sm.setGUI();
    }
}
