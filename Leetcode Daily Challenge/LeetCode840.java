class Solution {
    public int numMagicSquaresInside(int[][] grid) 
    {
        int res=0;
        for(int i=0;i<grid.length-2;i++)
        {
            for(int j=0;j<grid[0].length-2;j++)
            {
                res+=helper(grid,i,j);
            }
        }
        return res;
    }
    public int helper(int grid[][], int r, int c)
    {
        Set<Integer> s=new HashSet<>();
        int size=0;
        for(int i=r;i<r+3;i++)
        {
            int sum=0;
            for(int j=c;j<c+3;j++)
            {
                sum+=grid[i][j];
                s.add(grid[i][j]);
                size++;
                if(s.size()!=size || grid[i][j]<1 || grid[i][j]>9)
                    return 0;
            }
            if(sum!=15) return 0;
        }
        for(int i=c;i<c+3;i++)
        {
            int sum=0;
            for(int j=r;j<r+3;j++)
            {
                sum+=grid[j][i];
            }
            if(sum!=15) return 0;
        }
        if(grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2]!=15)
            return 0;
        if(grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c]!=15)
            return 0;
        return 1;
    }
}
