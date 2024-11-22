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
     * Complete the 'separateNumbers' function below.
     *
     * The function accepts STRING s as parameter.
     */

    public static void separateNumbers(String s) {
    // Write your code here
    if(s.charAt(0)=='0')
    {
        System.out.println("NO");
        return;
    }
    int len=s.length();
    for(int i=1;i<=len;i++)
    {
        long temp=Long.parseLong(s.substring(0,i));
        long t=temp;
        int j=i;
        while(j<len)
        {
            t=t+1;
            String ts=t+"";
            if(j+ts.length()<=len && s.substring(j,j+ts.length()).equals(ts))
            {
                j+=ts.length();
                if(j==len)
                {
                    System.out.println("YES "+temp);
                    return;
                }
                continue;
            }
            break;
        }
    }
    System.out.println("NO");

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                Result.separateNumbers(s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
