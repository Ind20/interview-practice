package Advanced;

import java.sql.*;

public class DbConnect {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "admin";
        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM employee WHERE first_name = 'Amit'";
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                String dbEmail = rs.getString("email");
                assert dbEmail.equals("amit.sharma@example.com") : "Email mismatch!";
                System.out.println("Database entry is correct.");
            } else {
                System.out.println("User not found in the database.");
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
