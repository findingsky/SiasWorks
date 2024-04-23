package itf;

import pojo.user;

interface UserMapper
{
    user selectUser(String uId);

    int insertUser(user user);

    int updateUser(user user);

    int deleteUser(String uId);
}