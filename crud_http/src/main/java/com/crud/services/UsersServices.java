package com.crud.services;

import com.crud.dtos.UserDTO;
import com.crud.entity.User;
import com.crud.repository.UsersRepository;

public class UsersServices {

    private UsersRepository repository = new UsersRepository();

    public String InsertUserService(UserDTO data){
        repository.insertUser(data);
        return "User was created";
    }

}
