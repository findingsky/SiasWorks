package org.example.pojo;

import javax.xml.crypto.Data;

public class User
{
    private char[] uId = new char[11];
    private String uName;
    private char[] uTel = new char[11];
    private Data uLastTime;
    private String uType;


    public void setuId(char[] uId)
    {
        this.uId = uId;
    }

    public char[] getuId()
    {
        return uId;
    }

    public void setuName(String uName)
    {
        this.uName = uName;
    }

    public String getuName()
    {
        return uName;
    }

    public void setuTel(char[] uTel)
    {
        this.uTel = uTel;
    }

    public char[] getuTel()
    {
        return uTel;
    }

    public void setuLastTime(Data uLastTime)
    {
        this.uLastTime = uLastTime;
    }

    public Data getuLastTime()
    {
        return uLastTime;
    }

    public void setuType(String uType)
    {
        if (uType.equals("admin") || uType.equals("user"))
        {
            this.uType = uType;
        }
        else
        {
            System.out.println("Wrong user type!");
        }
    }

    public String getuType()
    {
        return uType;
    }

    @Override

    public String toString()
    {

        return "User ID: " + uId + "\nUser Name: " + uName + "\nUser Tel: " + uTel + "\nUser Last Time: " + uLastTime + "\nUser Type: " + uType;
    }
}
