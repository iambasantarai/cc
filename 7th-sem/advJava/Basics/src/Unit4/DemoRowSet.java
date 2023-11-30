package Unit4;

/*
* row set is more flexible than result set as it is by default scrollable and updatable
* to create row set we need to import javax.sql.rowset package
*/
import java.sql.*;
import javax.sql.rowset.*;

public class DemoRowSet {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prime";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();

            // connect with database
            rs.setUrl(url);
            rs.setUsername(user);
            rs.setPassword(password);

            // sql
            rs.setCommand("SELECT * FROM registration");
            rs.execute();

            // extract all row
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Username: " + rs.getString("uname"));
                System.out.println("Password: " + rs.getString("password"));
                System.out.println("Gender: " + rs.getString("gender"));
                System.out.println("Course: " + rs.getString("course"));
            }

            // extract 2nd row
            rs.absolute(2);
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Username: " + rs.getString("uname"));
            System.out.println("Password: " + rs.getString("password"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Course: " + rs.getString("course"));

            // update username of 2nd row to Kesari and course to Java
            rs.updateString("uname", "Kesari");
            rs.updateString("course", "Java");
            rs.updateRow();

            System.out.println("=== AFTER UPDATE ===");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Username: " + rs.getString("uname"));
            System.out.println("Password: " + rs.getString("password"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Course: " + rs.getString("course"));

            // insert new record on last row
            rs.last();
            // if primary key (in our case id) is auto generated
            // rs.updateNull("id");
            rs.updateInt("id", 3);
            rs.updateString("uname", "Prime");
            rs.updateString("password", "primerian");
            rs.updateString("repass", "primerian");
            rs.updateString("gender", "Male");
            rs.updateString("course", "Rust");
            // to insert new row
            rs.insertRow();
            rs.moveToCurrentRow();

        } catch (ClassNotFoundException ce) {
            System.out.println("ERROR: " + ce);
        } catch (SQLException se) {
            System.out.println("SQL ERROR: " + se);
        }
    }
}
