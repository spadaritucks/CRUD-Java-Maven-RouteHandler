package com.crud.routes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import com.crud.controllers.UsersController;
import com.crud.dtos.UserDTO;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;


public class UsersHandler implements HttpHandler {

    private Gson gson = new Gson();
    UsersController usersController = new UsersController();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            String response = "";

            String method = exchange.getRequestMethod();

            if("POST".equals(method)) {
                InputStream body = exchange.getRequestBody();
                String bodyString = new String(body.readAllBytes(), StandardCharsets.UTF_8);

                UserDTO userDTO = gson.fromJson(bodyString, UserDTO.class);


                usersController.insertUser(userDTO);
            
               
            }

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();

        } catch (IOException e) {
            System.out.println("Falha na requisição" + e);
        }
    }
}
