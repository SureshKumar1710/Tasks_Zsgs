class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n==0) {
            return res;
        }
        backtrack(res,0,0,"",n);
        return res;
    }
    public void backtrack(List<String> res,int l, int r, String pt,int n)
    {
        if(pt.length()==2*n)
        {
            res.add(pt);
            return;
        }
        if(l<n)
            backtrack(res,l+1,r,pt+"(",n);
        if(r<l)
            backtrack(res,l,r+1,pt+")",n);
    }
}
