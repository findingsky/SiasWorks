package pojo;

import java.util.Date;

//定义一个抽象类reagentsList
public abstract class reagentsList
{
    //定义一个日期类型的变量rlDate
    private Date rlDate;
    //定义一个字符类型的数组rlReg，长度为11
    private char[] rlReg = new char[11];

    //获取rlDate的值
    public Date getRlDate()
    {
        return rlDate;
    }

    //设置rlDate的值
    public void setRlDate(Date rlDate)
    {
        this.rlDate = rlDate;
    }

    //获取rlReg的值
    public char[] getRlReg()
    {
        return rlReg;
    }

    //设置rlReg的值
    public void setRlReg(char[] rlReg)
    {
        this.rlReg = rlReg;
    }

    //重写toString方法
    @Override
    public String toString()
    {
        return "Date: " + rlDate + "\nRegistration: " + rlReg;
    }
}
