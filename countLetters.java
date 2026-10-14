import java.util.*;
public class countLetters {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    int count=0;
    for(int i =0;i<name.length();i++)
    {
        char ch = name.charAt(i);
        if(ch==' ')
        {
            continue;
        }
        else{
            count++;
        }
    }
    System.out.println(count);
}
}