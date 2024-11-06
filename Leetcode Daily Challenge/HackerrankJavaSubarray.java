import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt(),ans=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                count+=arr[j];
                if(count<0)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
