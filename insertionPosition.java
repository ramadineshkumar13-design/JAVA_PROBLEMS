import java.util.*;
class insertionPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine())
        {
            return;
        }
        String line =sc.nextLine().trim();
        String [] parts = line.split("\\s+");
        int []arr = new int[parts.length];
        for(int i=0;i<parts.length;i++)
        {
           arr[i] = Integer.parseInt(parts[i]);
        }
        if(!sc.hasNextInt())
        {
            return;
        }
        int target =sc.nextInt();
        int left =0;
        int right= arr.length-1;
        while(left<=right)
        {
            int mid =left+(right-left)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target)
            {
                left =mid+1;
            }
            else{
                right =mid-1;
            }
        }
        System.out.println(left);
    }
}                    