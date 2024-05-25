package manage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.StudentBean;
import db.Database1;

public class DatabaseManage
{


    public StudentBean query(String name1)
    {
        // 创建Database1对象，连接数据库
        Database1 db1 = new Database1();

        // 获取Statement对象
        Statement stmt = db1.getStatement();

        // 编写SQL查询语句
        String sql = "SELECT * FROM student WHERE name = '" + name1 + "'";

        try
        {
            // 执行SQL语句，获取结果集
            ResultSet rs = stmt.executeQuery(sql);

            // 如果结果集不为空，遍历结果集，获取学生信息
            if (rs.next())
            {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                int tall = rs.getInt("tall");
                int weight = rs.getInt("weight");
                String address = rs.getString("address");
                String school = rs.getString("school");
                String depart = rs.getString("depart");

                // 创建StudentBean对象，并返回
                return new StudentBean(name, age, tall, weight, address, school, depart);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        // 如果查询失败，返回null
        return null;
    }

    public boolean delete(String name1)
    {


    }


    public boolean insert(StudentBean stu1)
    {
        String name1 = stu1.getName();
        int age1 = stu1.getAge();

        String depart1 = stu1.getDepart();

        Database1 db1 = new Database1();
        Statement stmt = db1.getStatement();
        String sql1 = "insert into student values('" + name1 + "'," + age1 + "," + weight1 + "," + tall1 + ",'" + address1 + "','" + school1 + "','" + depart1 + "')";
        System.out.println(sql1);
        try
        {
            int a = stmt.executeUpdate(sql1);
            if (a == 1)
            {
                System.out.println("insert success");
                return true;
            }
            return false;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return false;
    }

}
