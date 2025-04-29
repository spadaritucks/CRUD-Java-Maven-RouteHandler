package com.crud.controllers;

import java.util.List;

import com.crud.dtos.UserDTO;
import com.crud.entity.User;
import com.crud.services.UsersServices;


public class UsersController {
    private UsersServices service = new UsersServices();
  
    public String insertUser(UserDTO userDTO) {
        String response = service.InsertUserService(userDTO);
        return response;
    }

    public List<User> getUsers(){
       List<User> list = service.getUsersService();
       return list;
    
    }

    public String deleteUser(String id){ 
        String response = service.deleteUserService(id);
        return response;
    }
}
