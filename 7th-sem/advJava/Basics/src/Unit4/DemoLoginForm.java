package Unit4;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LoginForm extends JFrame {
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField p1;
    JButton b1;

    public void setLoginForm() {
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("Result");
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        b1 = new JButton("Submit");

        add(l1);add(t1);
        add(l2);add(p1);
        add(b1);
        add(l3);

        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String uname = t1.getText();
                String pass = p1.getText();

                // connect to database
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

                    String loginQuery = "SELECT * FROM registration WHERE uname = ? AND password = ?";
                    PreparedStatement ps = connection.prepareStatement(loginQuery);
                    ps.setString(1, uname);
                    ps.setString(2, pass);

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        int id = rs.getInt("id");
                        String cuname = rs.getString("uname");
                        String gender = rs.getString("gender");
                        String course = rs.getString("course");
                        l3.setText("ID: " + id + " Username: " + uname + " Gender: " + gender + " Course: " + course);
                    } else {
                        l3.setText("Incorrect username of password.");
                    }

                } catch (ClassNotFoundException ce) {
                    System.out.println("ERROR: " + ce);
                } catch (SQLException se) {
                    System.out.println("SQL ERROR: " + se);
                }
            }
        });
    }
}

public class DemoLoginForm {
    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
        lf.setLoginForm();
    }
}
