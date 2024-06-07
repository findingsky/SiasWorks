package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.pojo.User;

import java.io.InputStream;

public class MybatisDemo
{
    public static void main(String[] args) throws Exception
    {
        // 指定全局配置文件
        String resource = "mybatis-config.xml";
        // 读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try
        {
            // 执行查询
            User user = sqlSession.selectOne("mapper.userMapper.selectUser", 1);
            // 输出结果
            System.out.println(user);
            // 提交事务
            sqlSession.commit();
        }
        finally
        {
            sqlSession.close();
        }
    }
}