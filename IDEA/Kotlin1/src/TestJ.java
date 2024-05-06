
import java.util.ArrayList;
import java.util.Collection;

public class TestJ
{
    public static void main(String[] args)
    {
        Collection<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){

            list.add("Element " + i);
        }
        System.out.println(list);
    }
}