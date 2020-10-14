package com.example.demo.User;

import java.util.List;

public interface RoleService {


    public List<Role> getRoleList();
    public Role getRole(int id);
    public void addRole();
    public void updateRole(int id);
    public void deleteRole(int id);
}
