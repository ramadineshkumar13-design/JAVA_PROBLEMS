import java.util.*;
public class MoveZeroEnd{
    public static void Zero(int []arr)
    {
        int out =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[out];
                arr[out] =temp;
                out++;
            }            
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int []arr = new int[n];
         for(int i =0;i<n;i++)
         {
            arr[i] = sc.nextInt();
         }

Zero(arr);
sc.close();

    }
}