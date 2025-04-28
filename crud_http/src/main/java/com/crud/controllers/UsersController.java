package com.crud.controllers;

import com.crud.dtos.UserDTO;
import com.crud.services.UsersServices;


public class UsersController {
    private UsersServices service = new UsersServices();
  
    public String insertUser(UserDTO userDTO) {
        service.InsertUserService(userDTO);
        return "Usuario criado com sucesso";
    }
}
