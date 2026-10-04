import java.util.*;
public class MovePosEnd{

public static void PosEnd(int []arr)
{
    int size =0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<0)
        {
          int temp = arr[i];
          arr[i] = arr[size];
          arr[size] =temp;
          size++;
        }
    }
    System.out.println(Arrays.toString(arr));
}
public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int []arr = new int [n];
  for(int i=0;i<n;i++)
  {
    arr[i] = sc.nextInt();
  }
PosEnd(arr);
  
}
}