package itf;

interface UserMapper
{
    user selectUser(String uId);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(String uId);
}