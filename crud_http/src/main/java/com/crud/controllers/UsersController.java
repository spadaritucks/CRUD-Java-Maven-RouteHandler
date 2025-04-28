package com.crud.controllers;

import java.util.List;

import com.crud.dtos.UserDTO;
import com.crud.entity.User;
import com.crud.services.UsersServices;


public class UsersController {
    private UsersServices service = new UsersServices();
  
    public String insertUser(UserDTO userDTO) {
        service.InsertUserService(userDTO);
        return "Usuario criado com sucesso";
    }

    public List<User> getUsers(){
       List<User> list = service.getUsersService();
       return list;
    
    }
}
