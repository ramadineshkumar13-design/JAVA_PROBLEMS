import java.util.*;
public class DutchNationalAlgo{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int Low =0;
        int Mid =0;
        int High =arr.length-1;
        while(Mid<=High)
        {
            if(arr[Mid]==0)
            {
                int temp = arr[Mid];
                arr[Mid] =arr[Low];
                arr[Low] =temp;
                Low++;
                Mid++;
            }
            else if(arr[Mid]==1)
            {
                Mid++;
            }
            else{
                int swap = arr[Mid];
                arr[Mid] =arr[High];
                arr[High] =swap;
                High--;

            }
        }
            System.out.println(Arrays.toString(arr));
        
    }
}