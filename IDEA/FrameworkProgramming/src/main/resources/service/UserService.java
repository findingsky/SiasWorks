package service;

import pojo.user;

public interface UserService
{

    // 删除用户
    int deleteUser(char[] uId);

    // 插入用户
    int insertUser(user u);

    // 查询用户
    user selectUser(char[] uId);

    // 更新用户
    int updateUser(user u);
}
