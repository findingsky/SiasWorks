public class Army
{
    LineUpStrategy strategy;

    public void setStrategy(LineUpStrategy strategy)
    {
        this.strategy = strategy;
    }
    public void lineUp(int a[])
    {
        if (strategy != null)
        {
            strategy.arrange(a);
        }
        else
        {
            System.out.println("No strategy is set");
        }
    }
}
