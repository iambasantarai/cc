package Unit4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Registration extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2;
    JPasswordField p1, p2;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;

    JButton b1;

    public void setRegistration() {
        l1 = new JLabel("Id");
        l2 = new JLabel("Username");
        l3 = new JLabel("Password");
        l4 = new JLabel("Repassword");
        l5 = new JLabel("Gender");
        l6 = new JLabel("Course");
        l7 = new JLabel("Result");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("C");
        c3 = new JCheckBox("Rust");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);
        b1 = new JButton("Submit");
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(p1);
        add(l4);add(p2);
        add(l5);add(r1);add(r2);
        add(l6);add(c1);add(c2);add(c3);
        add(b1);
        add(l7);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = t1.getText();
                String uname = t2.getText();
                String pass = p1.getText();
                String repass = p2.getText();
                String gender = "";
                if (r1.isSelected()) {
                    gender += "Male";
                }else {
                    gender += "Female";
                }
                String course = "";
                if (c1.isSelected()) {
                    course += "Java";
                }
                if (c2.isSelected()){
                    course += "C";
                }
                if (c3.isSelected()){
                    course += "Rust";
                }

                // connect to the database
                String url = "jdbc:mysql://localhost:3306/prime";
                String user = "root";
                String password = "root";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection connection = DriverManager.getConnection(url, user, password);

                    if (connection != null) {
                        System.out.println("DATABASE CONNECTION ESTABLISHED!");
                    } else {
                        System.out.println("FAILED TO ESTABLISH DATABASE CONNECTION!");
                    }

                    Statement stmt = connection.createStatement();

                    // inserting data into database
                    String insQuery = "INSERT INTO registration VALUES('" + id + "','" + uname + "','" + pass + "','" + repass + "','" + gender+"','"+course+"')";
                    int res = stmt.executeUpdate(insQuery);
                    if (res >= 1) {
                        l7.setText("Record has been inserted successfully.");
                    }

                    connection.close();
                } catch (ClassNotFoundException ce) {
                    System.out.println("ERROR: " + ce);
                } catch (SQLException se) {
                    System.out.println("SQL ERROR: " + se);
                }
            }
        });
    }
}

public class DemoRegistration {
    public static void main(String[] args) {
        Registration reg = new Registration();
        reg.setRegistration();
    }
}
