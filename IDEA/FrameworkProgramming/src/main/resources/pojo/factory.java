package pojo;

public class factory
{
    // 定义工厂ID
    private char[] fId = new char[11];
    // 定义工厂名称
    private String fName;
    // 定义工厂地址
    private String fAddress;
    // 定义工厂营业许可证
    private char[] fTrl = new char[11];

    // 获取工厂ID
    public char[] getFId()
    {
        return fId;
    }

    // 获取工厂名称
    public String getfName()
    {
        return fName;
    }

    // 获取工厂地址
    public String getfAddress()
    {
        return fAddress;
    }

    // 获取工厂营业许可证
    public char[] getfTrl()
    {
        return fTrl;
    }

    // 设置工厂ID
    public void setFId(char[] fId)
    {
        this.fId = fId;
    }

    // 设置工厂名称
    public void setfName(String fName)
    {
        this.fName = fName;
    }

    // 设置工厂地址
    public void setfAddress(String fAddress)
    {
        this.fAddress = fAddress;
    }

    // 设置工厂营业许可证
    public void setfTrl(char[] fTrl)
    {
        this.fTrl = fTrl;
    }

    // 重写toString方法
    @Override
    public String toString()
    {

        return "Factory ID: " + fId + "\nFactory Name: " + fName + "\nFactory Address: " + fAddress + "\nFactory Trade License: " + fTrl;
    }
}
