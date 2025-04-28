package com.crud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crud.dtos.UserDTO;
import com.crud.entity.User;

public class UsersRepository {

    private Connection connection;

    public UsersRepository() {
        connection = Database.getConnection();
    }

    public void insertUser(UserDTO user) {
        try {
            String query = "INSERT INTO users(name, age) VALUES (?,?)";

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, user.getName());
            pst.setInt(2, user.getAge());
            pst.execute();

            System.out.println("Usuário inserido com sucesso");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
            throw new RuntimeException("Erro ao inserir usuário no banco de dados", e);
        }
    }

    public List<User> getAllUsers () {
        try{
            String query = "SELECT * FROM users";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet result = pst.executeQuery();
            List<User> list = new ArrayList<>();
            while (result.next()) {
                User user = new User();
                user.setId(result.getInt("id"));
                user.setName(result.getString("name"));
                user.setAge(result.getInt("age"));
                list.add(user);
            }
            return list;
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir usuario " + e.getMessage());
            throw new RuntimeException("Erro ao inserir usuario no banco de dados ", e);
        }
    }
}
