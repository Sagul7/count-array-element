import java.util.Scanner;

public class CountArrayElement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println(countNumber(size,array));

    }
    public static int countNumber(int size,int[] array)
    {
        int count =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++)//run O(n)times
        {
            if(max<array[i])
            {
                max = array[i];
            }
        }
        for(int x : array)//run O(n)times
        {
            if(max == x)
            {
                count++;
            }
        }
// overall time n+n=2n...O(n)times;
        return size - count;
    }
}
