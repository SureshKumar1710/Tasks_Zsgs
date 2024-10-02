class Solution {
    public int numRookCaptures(char[][] board) 
    {
        int r=0,c=0;
        outer: for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(board[i][j]=='R')
                {
                    r=i;
                    c=j;
                    break outer;
                }
            }
        }
        int right=helper(board,r,c,1);
        int left=helper(board,r,c,-1);
        int down=helper2(board,r,c,1);
        int up=helper2(board,r,c,-1);
        return right+up+left+down;
    }
    public int helper(char[][] board, int r,int c,int inc)
    {
        for(int i=c+inc;i<8 && i>=0;i=i+inc)
        {
            if(board[r][i]=='p')
                return 1;
            else if(board[r][i]=='B')
                return 0;
        }
        return 0;
    }
    public int helper2(char[][] board, int r,int c,int inc)
    {
        for(int i=r+inc;i<8 && i>=0;i=i+inc)
        {
            if(board[i][c]=='p')
                return 1;
            else if(board[i][c]=='B')
                return 0;
        }
        return 0;
    }
}
