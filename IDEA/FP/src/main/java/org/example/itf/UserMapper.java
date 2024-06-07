package org.example.itf;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.pojo.User;
public interface UserMapper
{
    @Delete("delete from User where uId = #{uId}")
    int deleteUser(char[] uId);

    @Insert("insert into user values (#{uId}, #{uName}, #{uTel}, #{uLastTestTime}, #{uType})")
    int insertUser(User user);

    @Select("SELECT * FROM user where uId = #{uId}")
    User selectUser(char[] uId);

    @Update("update user set uId=#{uId}, uName=#{uName}, uTel=#{uTel}, uLastTestTime=#{uLastTestTime}, uType=#{uType} where rlId=#{rlId}")
    int updateUser(User user);
}
