class Solution {
    public static boolean exist(char[][] board, String word) 
    {
    	for(int i=0;i<board.length;i++)
    	{
    		for(int j=0;j<board[0].length;j++)
    		{
    			if(board[i][j]==word.charAt(0))
    			{
    				if(helper(board,word,i,j,0))
    					return true;
    			}
    		}
    	}
    	return false;
    }
    public static boolean helper(char[][] board,String s,int r,int c,int pos)
    {
    	if(pos>=s.length())
    		return true;
    	if(r<0 || r>=board.length || c<0 ||c>=board[0].length || board[r][c]!=s.charAt(pos))
    		return false;
    	char temp=board[r][c];
    	board[r][c]='0';
    	boolean right=helper(board,s,r,c+1,pos+1);
    	boolean left=helper(board,s,r,c-1,pos+1);
    	boolean top=helper(board,s,r-1,c,pos+1);
    	boolean bottom=helper(board,s,r+1,c,pos+1);
    	board[r][c]=temp;
    	return left||right||top||bottom;
    }
}
