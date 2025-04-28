package com.crud.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Connection connection;
    
    public static void sqliteConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:sqlite:crud_http/db/db.db";
                connection = DriverManager.getConnection(url);
              
            } catch(SQLException e) {
                System.out.println("The connection failed: " + e.getMessage());
                throw new RuntimeException("Failed to connect to the database", e); // <--- lançar exceção aqui
            }
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            throw new RuntimeException("Database connection was not initialized."); // <--- segurança extra
        }
        return connection;
    }
}


