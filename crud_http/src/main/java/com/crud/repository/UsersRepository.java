package com.crud.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.crud.dtos.UserDTO;

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
}
