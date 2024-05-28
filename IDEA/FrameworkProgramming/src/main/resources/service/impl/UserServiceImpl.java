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
    public int deleteUser(char[] uId)throws Exception
    {
        return userMapper.deleteUser(uId);
    }

    @Override
    public int insertUser(user u)throws Exception
    {
        return userMapper.insertUser(u);
    }

    @Override
    public user selectUser(char[] uId)throws Exception
    {
        return userMapper.selectUser(uId);
    }

    @Override
    public int updateUser(user u)throws Exception
    {
        return userMapper.updateUser(u);
    }
}
