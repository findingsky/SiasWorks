public class StrategyA implements LineUpStrategy
{
    public void arrange(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            int index=i,j=0;
            for (j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[index])
                {
                    index = j;
                }
            }
            if (index != i)
            {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }
}
