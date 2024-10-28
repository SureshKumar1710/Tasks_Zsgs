class Solution {
    public List<Integer> diffWaysToCompute(String expression) 
    {
        List<Integer> res = new ArrayList<>();
        if(expression.length()<3)
        {
            res.add(Integer.parseInt(expression.substring(0)));
            return res;
        }   
        for(int i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)=='+' || expression.charAt(i)=='-' || expression.charAt(i)=='*')
            {
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                for(int k=0;k<left.size();k++)
                {
                    for(int j=0;j<right.size();j++)
                    {
                        if(expression.charAt(i)=='+')
                        {
                            res.add(left.get(k)+right.get(j));
                        }
                        else if(expression.charAt(i)=='-')
                        {
                            res.add(left.get(k) - right.get(j));
                        }
                        else if(expression.charAt(i)=='*')
                        {
                            res.add(left.get(k) * right.get(j));
                        }
                    }
                }

            }
        }
        return res;
    }
}
