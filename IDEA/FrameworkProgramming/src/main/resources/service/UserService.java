package service;

import pojo.user;

import java.util.List;

public interface UserService
{
    user selectUser(char[] uId);
    void insertUser(user user);
    void updateUser(user user);
    void deleteUser(char[] uId);
}
