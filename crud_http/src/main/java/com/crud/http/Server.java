package com.crud.http;
import java.net.InetSocketAddress;

import com.crud.controllers.UsersController;
import com.crud.routes.UsersHandler;
import com.sun.net.httpserver.HttpServer;

public class Server {

    private HttpServer server;
    private Integer port = 8080;
    
    public Server() throws Exception {

        try{
            server = HttpServer.create(new InetSocketAddress(port), 0);

            server.createContext("/users", new UsersHandler() );
        }catch(Exception e){
            throw new Exception("Start Server Error " + e );
        }

    } 

    public void start() {
        server.start();
        System.out.println("Server was started in the port " + port);
    }

    public void stop() {
        server.stop(0);
    }
}
