package ru.glebov.spingboot.service;

import ru.glebov.spingboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    User getUserById(long id);

    void deleteUserById(long id);
}
