/*
 * generally result set point to first row of table and move forwards and by default result set can not be used to update
 data.
 * by using update table and scrollable result set we can move the pointer to any row of a table i.e. we can access 3rd
 row last row or any row according to our needs
*/
package Unit4;
import java.sql.*;

public class UpdatableAndScrollableResultSet {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prime";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);

            // use updatable and scrollable result set
            // CONCUR_SCROLL_SENSITIVE -> for scrolling into tables
            // CONCUR_READ_ONLY -> read only
            Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            if (connection != null) {
                System.out.println("DATABASE CONNECTION ESTABLISHED!");
            } else {
                System.out.println("FAILED TO ESTABLISH DATABASE CONNECTION!");
            }

            // display query
            String disQuery = "SELECT * FROM student";

            ResultSet rs = stmt.executeQuery(disQuery);

            // fetching last row
            System.out.println("=== FETCHING LAST ROW ===");
            rs.last();
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Course: " + rs.getString("course"));

            //fetching any row: fetching first row
            rs.absolute(1);
            System.out.println("=== FETCHING FIRST ROW ===");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Course: " + rs.getString("course"));

            // currently we are in 1st row now to fetch data of next row next() method is used
            rs.next();
            System.out.println("=== FETCHING NEXT ROW ===");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Course: " + rs.getString("course"));

            connection.close();
        } catch (ClassNotFoundException ce) {
            System.out.println("ERROR: " + ce);
        } catch (SQLException se) {
            System.out.println("SQL ERROR: " + se);
        }
    }
}
