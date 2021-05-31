package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection {

    static Connection dbConnection = null;

    private DatabaseConnection() {
    }

    public static Connection getConnection() {

        if (dbConnection != null) {
            System.out.println("Found existing DB connection");
            return dbConnection;
        }

        try {
            dbConnection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/soSafeDB?autoReconnect=true&useSSL=false", "root", "test");
        } catch (SQLException e) {
            System.out.println("Connection to Database Failed!");
            e.printStackTrace();
        }

        if (dbConnection == null) {
            System.out.println("Issue in initializing database! Database not initialized");
        }

        return dbConnection;
    }
}
