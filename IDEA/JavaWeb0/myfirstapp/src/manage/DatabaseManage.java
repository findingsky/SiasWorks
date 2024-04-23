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
        /*
         * 查询数据库
         */

        Database1 db1 = new Database1();
        Statement stmt = db1.getStatement();
        StudentBean stu1 = new StudentBean();
        String sql1 = "select * from student where name = '" + name1 + "'";
        try
        {
            ResultSet rs = stmt.executeQuery(sql1);
            if (rs != null)
            {
                if (rs.next())
                {
                    String name2 = rs.getString(1);
                    int age1 = rs.getInt("age");
                    int weight1 = rs.getInt(4);
                    int tall1 = rs.getInt(3);
                    String address1 = rs.getString(5);
                    String school1 = rs.getString(6);
                    String depart1 = rs.getString(7);
                    stu1.setName(name1);
                    stu1.setAge(age1);
                    stu1.setWeight(weight1);
                    stu1.setTall(tall1);
                    stu1.setAddress(address1);
                    stu1.setSchool(school1);
                    stu1.setDepart(depart1);
                    return stu1;
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return stu1;
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
