package com.crud.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static Connection connection;
    
    public static void sqliteConnection(){
        try{
            if(connection == null){
                String url = "jdbc:sqlite:./db/sqlite.db";
                connection = DriverManager.getConnection(url);
                System.out.println(connection);

                System.out.println("Connection success");
            }

        }catch(Exception e){
            System.out.println("The Connection was failed " + e);

        }
        
    }

    public static Connection getConnection(){
        return connection;
    }
}

