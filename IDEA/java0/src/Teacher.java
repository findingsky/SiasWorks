public class Teacher extends Person
{
    Teacher(String location0, String name0, String capital0)
    {
        super(location0, name0);
        setCapital(capital0);
    }

    private String capital;

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }
    public void info()
    {
        System.out.println(getLocation()+getName()+getCapital());
    }
}
