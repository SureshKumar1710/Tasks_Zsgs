class Solution {
    public String getHint(String secret, String guess) 
    {
        int secretCount[]=new int[10];
        int guessCount[]=new int[10];
        int A=0,B=0;
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                A++;
            }
            else
            {
                secretCount[secret.charAt(i)-'0']++;
                guessCount[guess.charAt(i)-'0']++;
            }
        }

        for(int i=0;i<10;i++)
        {
            if(secretCount[i]!=0 && guessCount[i]!=0)
            {
                B+=Math.min(secretCount[i],guessCount[i]);
            }
        }

        StringBuilder ans=new StringBuilder("");
        ans.append(A).append('A').append(B).append('B');
        return ans.toString();
    }
}
