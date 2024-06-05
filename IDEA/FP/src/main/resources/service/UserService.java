package service;

import pojo.User;

public interface UserService
{
    // 删除用户
    int deleteUser(char[] uId)throws Exception;

    // 插入用户
    int insertUser(User u)throws Exception;

    // 查询用户
    User selectUser(char[] uId)throws Exception;

    // 更新用户
    int updateUser(User u)throws Exception;
}
