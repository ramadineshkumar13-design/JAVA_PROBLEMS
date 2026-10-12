import java.util.*;
public class WithoutVowels{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i =0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U')
            {
                continue;
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
