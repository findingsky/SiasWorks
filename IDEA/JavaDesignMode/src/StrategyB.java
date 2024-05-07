public class StrategyB implements LineUpStrategy
{
    public void arrange(int a[])
    {
        int n = a.length;
        for (int m = 0; m < n - 1; m++)
        {
            for (int i = 0; i < n - m - 1; i++)
            {
                if (a[i] < a[i + 1])
                {
                    int temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
}
