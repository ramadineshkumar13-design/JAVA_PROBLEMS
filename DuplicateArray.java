import java.util.*;
public class DuplicateArray{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean[] isVisited = new boolean[arr.length];
        int count =0;
        for(int i =0;i<n;i++)
        {
            if(isVisited[i]==true)
            {
                continue;
            }
            count++;
            for(int j=i+1 ;j<n;j++)
            {
                   if(arr[i]==arr[j])
                   {
                    isVisited[j] =true;
                   }
            }
        }
          System.out.println("The Unique Elements :"+count);
          for(int i =0;i<n;i++)
          {
            if(!isVisited[i])
            {
                System.out.println("The Unique Elements are "+arr[i]+" ");
            }
          }
          sc.close();
    }
}