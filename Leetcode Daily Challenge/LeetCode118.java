class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result=new ArrayList<>();
        if(numRows==0) return result;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        result.add(row);
        for(int i=2;i<=numRows;i++)
        {
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=0;j<row.size()-1;j++)
                curr.add(row.get(j)+row.get(j+1));
            curr.add(1);
            result.add(curr);
            row=curr;
        }
        return result;
    }
}
