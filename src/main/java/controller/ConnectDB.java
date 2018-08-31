package controller;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectDB {

    static Connection dbConnection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }

        System.out.println("MySQL JDBC Driver Registered!");

        try {
            dbConnection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/soSafeDB?autoReconnect=true&useSSL=false","root", "1123Abc.");


        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        if (dbConnection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return dbConnection;
    }
}
