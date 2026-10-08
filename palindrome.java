import java.util.*;
public class palindrome{
    public static void pali(int []arr)
    {  
        int start =0;
        int end = arr.length-1;
        boolean found =true;
        while(start<end)
        {
            if(arr[start]!=arr[end])
            {
               found =false;
               break;
            }
               start++;end--;

        }
        if(found)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
         
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
        pali(arr);
    }
}