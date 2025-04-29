package com.crud.services;

import java.util.List;

import com.crud.dtos.UserDTO;
import com.crud.entity.User;
import com.crud.repository.UsersRepository;

public class UsersServices {

    private UsersRepository repository = new UsersRepository();

    public String InsertUserService(UserDTO data){
        repository.insertUser(data);
        return "User was created";
    }

    public List<User> getUsersService (){
        List<User> list = repository.getAllUsers();
        return list;
    }

    public String deleteUserService(String id){
        String response = repository.deleteUser(id);
        return response;
    }

}
