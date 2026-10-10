import java.util.*;
public class stringconsonent{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int vowelcount =0;
        int consonentcount =0;
        name = name.toUpperCase();
        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U')
            {
                 vowelcount++;
            }
            else
            {
                consonentcount++;
            }
        }
        System.out.println("VOWELS :"+vowelcount);
        System.out.println("CONSONENT :"+consonentcount);
    }
}