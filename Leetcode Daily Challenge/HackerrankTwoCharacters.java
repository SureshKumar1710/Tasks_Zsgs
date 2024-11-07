import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) 
    {
    // Write your code here
    Set<Character> st=new HashSet<>();
    for(int i=0;i<s.length();i++)
    {
        st.add(s.charAt(i));
    }
    int[] unique=new int[st.size()];
    int j=0,max=0;
    for(int i:st)
    {
        unique[j++]=i;
    }
    for(int i=0;i<unique.length;i++)
    {
        char charA=(char)unique[i];
        for(j=0;j<unique.length;j++)
        {
            if(i==j) continue;
            char charB=(char)unique[j];
            boolean flag=false;
            int count=0;
            for(int k=0;k<s.length();k++)
            {
                if(s.charAt(k)==charA)
                {
                    if(!flag)
                    {
                        count++;
                        flag=true;
                    }
                    else
                    {
                        count=0;
                        break;
                    }
                }
                else if(s.charAt(k)==charB)
                {
                    if(flag)
                    {
                        count++;
                        flag=false;
                    }
                    else
                    {
                        count=0;
                        break;
                    }
                }
            }
            if(count>max)
                max=count;
        }
    }
    return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
