class Solution {
    public List<String> validStrings(int n) 
    {
        String temp="";
        List<String> res=new ArrayList<>();
        helper(temp,res,n);
        return res;
    }
    public void helper(String temp,List<String> res,int n)
    {
        if(temp.length()==n)
        {
            res.add(temp);
            return;
        }
        if(temp.length()==0 || temp.charAt(temp.length()-1)=='1')
        {
            helper(temp+'0',res,n);
        }
        helper(temp+'1',res,n);
        return;
    }
}
