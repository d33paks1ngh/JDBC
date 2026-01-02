import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "0000";

        try {
            // Load JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, username, password);

            // Write SQL Query
            String sql = "SELECT id, name FROM users";

            // Execute Query
         //   Statement stmt = con.createStatement();
         //   ResultSet rs = stmt.executeQuery(sql);

            // Read Result
            /*
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }
*/
            // Close Resources
         //   rs.close();
          //  stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
