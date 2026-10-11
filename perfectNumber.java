import java.util.*;
public class perfectNumber{
    public static void prefect(int n)
    {
       int sum =0;
        for(int i =1 ;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println(sum+" is a perfect number");
        }
        else
        {
            System.out.println(sum+" is not a perfect number");
        }
        
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prefect(n);
    }
    
    }
