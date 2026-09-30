import java.util.*;
public class MethodOddEven{
    public static boolean evenodd(int num)
    {
        return num%2==0;
    }
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
System.out.println(num1+"is EVEN ?"+evenodd(num1));
System.out.println(num2+"is EVEN ?"+evenodd(num2));
}
}