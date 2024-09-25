class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        s=remove(s);
        t=remove(t);
        return s.equals(t);
    }
    public String remove(String s)
    {
    	Stack<Character> st=new Stack<>();
    	for(int i=0;i<s.length();i++)
    	{
    		if(s.charAt(i)=='#')
    		{
    			if(!st.empty())
    			    st.pop();
    		}
    		else
    			st.push(s.charAt(i));
    	}
    	return st.toString();
    }
}
