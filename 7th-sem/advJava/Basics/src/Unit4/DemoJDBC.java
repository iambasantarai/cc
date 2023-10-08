package Unit4;
import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) {

        // STEP 1: Initialize jdbc driver and define database connection details
        // db configs
        String url = "jdbc:mysql://localhost:3306/prime";
        String user = "root";
        String password = "root";

        // It will throw a ClassNotFoundException if the driver class is missing
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // STEP 2: Connect to the database using DriverManager.getConnection()
            Connection connection = DriverManager.getConnection(url, user, password);

            // STEP 3: Create a statement object to check and execute queries
            Statement stmt = connection.createStatement();

            if (connection != null) {
                System.out.println("DATABASE CONNECTION ESTABLISHED!");
            } else {
                System.out.println("FAILED TO ESTABLISH DATABASE CONNECTION!");
            }

            // STEP 4: Write proper SQL query

            // Create table
            String tblQuery = "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(50), gender VARCHAR(50), course VARCHAR(50))";

            // STEP 5: Execute query using statement
            stmt.execute(tblQuery);
            System.out.println("Table created!");

            System.out.println("=== INSERTING DATA ===");
            String insQuery = "INSERT INTO student VALUES(1, 'ram', 'male', 'csit')";

            int ans = stmt.executeUpdate(insQuery); // Returns the number of rows affected
            if (ans == 1) {
                System.out.println("Row inserted.");
            }

            System.out.println("=== RETRIEVING DATA ===");
            String disQuery = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(disQuery);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String course = rs.getString("course");
                System.out.println("ID: " + id + "\n" + "NAME: " + name + "\n" + "GENDER: " + gender + "\n" + "COURSE: " + course + "\n");
            }

            // Update the name to 'hari' and course to 'bca' where id is 1
            String updQuery = "UPDATE student SET name='hari', course='bca' WHERE id = 1";
            stmt.execute(updQuery);
            System.out.println("Record updated.");

            // Delete the record where id is 1
            String delQuery = "DELETE FROM student WHERE id=1";
            stmt.execute(delQuery);
            System.out.println("Record deleted.");

            // Close the connection
            connection.close();

        } catch (ClassNotFoundException ce) {
            System.out.println("ERROR: " + ce);
        } catch (SQLException se) {
            System.out.println("SQL ERROR: " + se);
        }
    }
}