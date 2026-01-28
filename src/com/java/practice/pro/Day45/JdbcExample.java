package com.java.practice.pro.Day45;

import java.sql.*;


public class JdbcExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "admin";

        try {
            //1. Load driver (optional in newer Java versions)
            Class.forName("org.postgresql.Driver");
            //2. Connect
            Connection conn = DriverManager.getConnection(url, user, pass);
            //3. Create statement
            PreparedStatement stmt = conn.prepareStatement("select * from emp ");
            //4. Execute query
            ResultSet rs = stmt.executeQuery();
            // 5. Process results
            while (rs.next()) {

                System.out.println(rs.getInt("emp_id") + " | " +

                        rs.getString("emp_name") + " | " +


                        rs.getDouble("salary"));

            }

            // 6. Close resources
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}