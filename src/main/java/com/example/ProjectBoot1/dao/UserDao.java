package com.example.ProjectBoot1.dao;

import com.example.ProjectBoot1.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    User getUserByName(String name);
}
