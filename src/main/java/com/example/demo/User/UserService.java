package com.example.demo.User;

import java.util.List;

public interface UserService {

    public List<User> getUserList();
    public Role getUser(int id);
    public void addUser();
    public void updateUser(int id);
    public void deleteUser(int id);
}
