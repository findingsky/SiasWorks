package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.user;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDao userDao;

    @Override
    public user getUserById(char[] uId)
    {
        return userMapper.selectUser(uId);
    }

    @Override
    public void addUser(user u)
    {
        userMapper.insertUser(u);
    }

    @Override
    public void updateUser(user user)
    {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(char[] uId)
    {
        userDao.deleteUser(uId);
    }
}

