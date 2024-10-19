class Solution {
    public static String decodeString(String s) 
    {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==']')
            {
                String sb="";
                while(!st.isEmpty() && !st.peek().equals("["))
                {
                    sb=st.pop()+sb;
                }
                if(!st.isEmpty())
                st.pop();
                int num=0,factor=1;
                while(!st.isEmpty() && st.peek().charAt(0)>='0' && st.peek().charAt(0)<='9')
                {
                    num=num+(Integer.parseInt(st.pop())*factor);
                    factor*=10;
                }
                String temp="";
                while(num-- > 0)
                {
                    temp+=sb.toString();
                }
                st.push(temp);
            }
            else 
                st.push(s.substring(i,i+1));
        }
        String res="";
        while(!st.isEmpty())
        {
            res=st.pop()+res;
        }
        return res;
    }
}
