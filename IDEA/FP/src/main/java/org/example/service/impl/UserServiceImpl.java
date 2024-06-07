package org.example.service.impl;

import org.example.itf.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.pojo.User;
import org.example.service.UserService;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteUser(char[] uId)throws Exception
    {
        return userMapper.deleteUser(uId);
    }

    @Override
    public int insertUser(User u)throws Exception
    {
        return userMapper.insertUser(u);
    }

    @Override
    public User selectUser(char[] uId)throws Exception
    {
        return userMapper.selectUser(uId);
    }

}
