package ArrayOperations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arrStatic = {7, 3, 3, 1, 5};
        arr = dynamic(arr);
        System.out.println("等待进行冒泡排序的数组" + Arrays.toString(arr));
        arr = sortArray0(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr0 = new int[10];
        for (int i = 0; i < arr0.length; i++)
        {
            arr0[i] = (int) (Math.random() * 100);
        }
        System.out.println("等待进行快速排序的数组" + Arrays.toString(arr0));
        quickSort(arr0, 0, arr0.length - 1);
        System.out.println(Arrays.toString(arr0));
        System.out.println("输入要查找的数字");
        int toSearch = sc.nextInt();
        System.out.println("第" + (search(arr, toSearch) + 1) + "个");
    }

    public static int[] dynamic(int[] arr)//动态定义数组
    {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("请输入下一个数字");
            arr[i] = sc.nextInt();
        }
        System.out.println("输入完成");
        return arr;// 返回原数组
    }


    public static int[] sortArray0(int[] arr)//冒泡排序
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            boolean flag = true;

            for (int j = 0; j < arr.length - 1 - i; j++)
            {

                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
            {
                break;
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right)//快速排序
    {
        if (left < right)
        {
            int pivot = arr[left];//定义基准
            int begin = left;//序列开始
            int end = right;//序列结束

            while (right > left)
            {
                if (arr[right] < pivot)//队尾元素小于基准
                {
                    arr[left] = arr[right];//队尾插到队首
                    left++;//队首索引后移
                }
                else//队尾元素大于基准
                {
                    right--; //将队尾索引前移并继续从队尾比较
                    continue;
                }
                while (right > left)
                {
                    if (arr[left] > pivot)//队首元素大于基准
                    {
                        arr[right] = arr[left];//就将队首位置插到队尾
                        right--;//队尾索引前移
                        break;
                    }
                    else//队首元素小于基准
                    {
                        left++;//队首索引前移并继续从队首比较
                    }
                }
            }
            arr[left] = pivot;//队首和队尾索引重合，将基准插入此位置

            quickSort(arr, begin, left - 1);
            quickSort(arr, left + 1, end);
        }
    }

    public static int search(int[] arr, int key)//二分查找
    {
        int left = 0;
        int right = arr.length - 1;

        while (0 <= arr.length - 1)
        {
            int mid = left + (right - left) / 2;//防止溢出
            if (arr[mid] == key)
            {
                return mid;
            }
            else if (arr[mid] > key)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return -1;
    }

}
