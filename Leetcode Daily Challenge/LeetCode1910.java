class Solution {
    public String removeOccurrences(String s, String part) 
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp+=s.charAt(i);
            if(temp.length()>=part.length())
            {
                int start=temp.length()-part.length();
                if(temp.substring(start).equals(part))
                {
                    temp=temp.substring(0,start);
                }
            }
        }
        return temp;
    }
}
