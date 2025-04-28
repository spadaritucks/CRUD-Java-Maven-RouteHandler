package com.crud.dtos;

public class UserDTO {
    private String name;
    private int age;

    // Construtor vazio (obrigatório se você quiser fazer instâncias automáticas)
    public UserDTO() {}

    // Construtor cheio
    public UserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}