class Solution {
    public static boolean findRotation(int[][] mat, int[][] target) {
        int ans1=0,ans2=0,ans3=0,ans4=0,n=mat.length;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<target.length;j++)
        	{
        		if(mat[i][j]==target[i][j])
        			ans1++;
        		if(mat[i][j]==target[j][n-i-1])
        			ans2++;
        	    if(mat[i][j]==target[n-i-1][n-j-1])
        	    	ans3++;
        	    if(mat[i][j]==target[n-j-1][i])
        	    	ans4++;
        	}
        }
        return ans1==n*n || ans2==n*n || ans3==n*n || ans4==n*n;
    }
}
