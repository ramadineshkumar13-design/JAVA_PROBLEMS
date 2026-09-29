import java.util.*;
public class SumMethod{
    public static int ADD(int a,int b)
    {
        int sum =a+b;
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result  = ADD(a,b);
        int total = result*10;
        System.out.println( "TOTAL :"+total);

    }
}