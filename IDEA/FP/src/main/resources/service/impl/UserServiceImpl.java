package service.impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;

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

    @Override
    public int updateUser(User u)throws Exception
    {
        return userMapper.updateUser(u);
    }
}
