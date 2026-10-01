import java.util.*;
public class MaxMin
{
    public static void  FindMaxMin(int []arr)
    {
           int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>max)
             {
                max =arr[i];
              
             }
             if(arr[i]<min)
             {
                min =arr[i];
            
             }
        }
    
            System.out.println("MAX :"+max);
        System.out.println("MIN :"+min);

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
          
       FindMaxMin(arr);
       sc.close();
       
      }
}
   