public class StrategyC implements LineUpStrategy
{
    public void arrange(int[] a)
    {
        int oddNumberAmount = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                oddNumberAmount++;
            }
        }
        int oddArray[] = new int[oddNumberAmount];
        int evenArray[] = new int[a.length - oddNumberAmount];
        for (int i = 0, j = 0, k = 0; i < a.length; i++)
        {

            if (a[i] % 2 != 0)
            {
                oddArray[j] = a[i];
                j++;
            }
            else
            {
                evenArray[k] = a[i];
                k++;
            }
        }

        for (int i = 0; i < oddArray.length; i++)
        {
            int index = i, j;

            for (j = i + 1; j < oddArray.length; j++)
            {

                if (oddArray[j] < oddArray[index])
                {
                    index = j;
                }
            }
            if (index != i)
            {
                int temp = oddArray[index];
                oddArray[index] = oddArray[i];
                oddArray[i] = temp;
            }
        }
        int n = evenArray.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {

                if (evenArray[j] > evenArray[j + 1])
                {
                    int temp = evenArray[j];
                    evenArray[j] = evenArray[j + 1];
                    evenArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < oddArray.length; i++)
        {
            a[i] = oddArray[i];
        }

        for (int i = 0; i < evenArray.length; i++)
        {
            a[i + oddArray.length] = evenArray[i];
        }
    }
}
