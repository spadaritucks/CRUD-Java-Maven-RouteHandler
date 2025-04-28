package com.crud.config;

import com.crud.http.Server;

public class Application {

    public static void run() {
        try {
            Server server = new Server();
            server.start();
        } catch (Exception e) {
        System.out.println("Start Server Error " + e );
        }
    }
}
