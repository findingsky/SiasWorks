package pojo;

import java.util.Date;

public class Reagents
{
    // 定义一个char类型的数组，用于存储试剂的id
    private char[] rid = new char[11];
    // 定义一个Date类型的变量，用于存储试剂的生产日期
    private Date rDate;
    // 定义一个char类型的数组，用于存储试剂的生产工厂
    private char[] rFactory = new char[11];
    // 定义一个char类型的数组，用于存储试剂的使用者
    private char[] rUser = new char[11];

    // 获取试剂的id
    public char[] getRid()
    {
        return rid;
    }

    // 获取试剂的生产日期
    public Date getrDate()
    {
        return rDate;
    }

    // 获取试剂的生产工厂
    public char[] getrFactory()
    {
        return rFactory;
    }

    // 获取试剂的使用者
    public char[] getrUser()
    {
        return rUser;
    }

    // 设置试剂的id
    public void setRid(char[] rid)
    {
        this.rid = rid;
    }

    // 设置试剂的生产日期
    public void setrDate(Date rDate)
    {
        this.rDate = rDate;
    }

    // 设置试剂的生产工厂
    public void setrFactory(char[] rFactory)
    {
        this.rFactory = rFactory;
    }

    // 设置试剂的使用者
    public void setrUser(char[] rUser)
    {
        this.rUser = rUser;
    }

    // 重写toString方法，用于输出试剂的信息
    @Override
    public String toString()
    {

        return "rid:" + rid + "\n" + "rDate:" + rDate + "\n" + "rFactory:" + rFactory + "\n" + "rUser:" + rUser + "\n";
    }
}
