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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong
     boolean lower=false,upper=false,num=false,special=false;
     for(int i=0;i<n;i++)
     {
         char c=password.charAt(i);
         if(c>='0' && c<='9')
             num=true;
         else if(c>='a' && c<='z')
             lower=true;
        else if(c>='A' && c<='Z')
             upper=true;
        else 
             special=true;
        if(upper && lower && special && num)
            break;
     }
     int count=0;
     if(!num) count++;
     if(!lower) count++;
     if(!upper) count++;
     if(!special) count++;
     if(n+count<6)
         count+=(6-n-count);
    return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
