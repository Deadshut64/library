package com.example.library.model.connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {

        public void testDatabase() {
            try {
                Class.forName("org.postgresql.Driver");
                String url = "jdbc:postgresql://localhost:5432/postgres";
                String login = "postgres";
                String password = "password";
                java.sql.Connection con = DriverManager.getConnection(url, login, password);
                try {
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM customers ");
                    while (rs.next()) {
                        String str = rs.getString("customer_id") + ":" + rs.getString(2);
                        System.out.println("customer:" + str);
                    }
                    rs.close();
                    stmt.close();
                } finally {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
