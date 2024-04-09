
public class Person
{
    Person(String location0, String name0)
    {
        this.name = name0;
        this.location = location0;
    }

    private String name;
    private String location;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }

    public void info()
    {
        System.out.println(getLocation()+getName());
    }
}
