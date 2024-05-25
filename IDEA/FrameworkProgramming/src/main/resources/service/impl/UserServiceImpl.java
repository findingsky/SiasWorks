package service.impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.user;

@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteUser(char[] uId)
    {
        return userMapper.deleteUser(uId);
    }

    @Override
    public int insertUser(user u)
    {
        return userMapper.insertUser(u);
    }

    @Override
    public user selectUser(char[] uId)
    {
        return userMapper.selectUser(uId);
    }

    @Override
    public int updateUser(user u)
    {
        return userMapper.updateUser(u);
    }
}
