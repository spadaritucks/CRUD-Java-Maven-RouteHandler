package com.crud;

import com.crud.config.Application;
import com.crud.repository.Database;

public class Main {
    public static void main(String[] args) {
        Database.sqliteConnection();
        Application.run();
 
    }
}