package com.mycompany.interfaces;

import com.mycompany.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(User user);

}
