import java.util.*;
public class countVowels{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String name = sc.nextLine();
        name = name.toLowerCase();
        int count =0;
        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
            {
                count++;
            }
        }
        System.out.println(count);

    }
}