class Solution {
    public static int numDecodings(String s) 
    {
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                dp[i+1]=0;
            else
                dp[i+1]=dp[i];
            if(i-1>=0 && s.charAt(i-1)>'0')
            {
            	if((s.charAt(i-1)=='1') || (s.charAt(i-1)=='2' && s.charAt(i)<'7'))
            		dp[i+1]+=dp[i-1];
            }
        }
        return dp[s.length()];
    }
}
