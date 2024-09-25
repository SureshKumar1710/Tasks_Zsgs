class Solution {
   public static int numSquares(int n) 
    {
        if(n<=3)
    		return n;
        int t=(int)Math.sqrt(n);    	
    	  int ans=Integer.MAX_VALUE;
        for(int i=t;i>0;i--)
        {
            int y=0;
            if(i*i<=n)
        	    y=(n/(i*i))+numSquares(n%(i*i));
        	  ans=Math.min(ans,y);
        }
        return ans;
    }
}
