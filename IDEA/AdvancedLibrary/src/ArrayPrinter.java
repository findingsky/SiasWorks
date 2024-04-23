import java.lang.reflect.Array;

public class ArrayPrinter
{
    public static void main(String[] args)
    {
        int[] intArray = new int[]{1, 2, 3};
        float[] floatArray = new float[]{1.0F, 2.0F, 3.0F};
        double[] doubleArray = new double[]{11.11, 22.22, 33.33};
        //依次输出
        printArrays(intArray);
        printArrays(floatArray);
        printArrays(doubleArray);
    }

    public static void printArrays(Object array)
    {
        try
        {
            // 获取数组对象的Class对象
            Class arrayClass = array.getClass();
            // 获取数组元素类型的Class对象
            Class component = arrayClass.getComponentType();
            // 输出数组元素的类型
            System.out.print(component.getName() + "数组元素依次排列：");
            // 获取数组的长度
            int length = Array.getLength(array);

            for (int i = 0; i < length; i++)
            {
                // 获取数组元素后输出
                System.out.print(Array.get(array, i));

                // 如果不是最后一个元素，添加~符号
                if (i < length - 1)
                {
                    System.out.print("~");
                }
            }
            //换行
            System.out.println();
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
    }
}