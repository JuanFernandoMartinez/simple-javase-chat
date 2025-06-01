package com.example.messageapp;

import java.sql.*;

public class DBConnection {

    public Connection getConnection() {


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:10000/chat", "root", "secret");

            if (connection != null) {
                System.out.println("successfully connection");
            }
        } catch (SQLException e) {
            e.printStackTrace()
        }

        return connection;
    }

}
