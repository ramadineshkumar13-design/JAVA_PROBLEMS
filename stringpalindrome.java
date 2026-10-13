import java.util.*;
class stringpalindrome {
    public static boolean ispalindrome(String name)
    {
        int start =0;
        int end = name.length()-1;
        while(start<end)
        {
            if(name.charAt(start)!=name.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;


    }
    public static void main(String[] args) {
        Scanner dk = new Scanner(System.in);
        String name = dk.nextLine();

         if (ispalindrome(name))
         {
            System.out.println("palindrome :"+name);
         }
         else
         {
            System.out.println(" not palindrome :"+name);
         }

    }
}