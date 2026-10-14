import  java.util.*;
class Main Stringbuilderpalindrome{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String name = sc.nextLine();
           StringBuilder num =new StringBuilder(name);
            String ch =num.reverse().toString();
            if(name.equals(ch))
            {
                System.out.println("palindrome :"+ch);

            }
            else
            {
                System.out.println("Not palindrome :"+ch);
            }

        
    }
}