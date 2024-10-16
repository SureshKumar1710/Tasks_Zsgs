class Solution {
    public int compress(char[] chars) 
    {
        int res=0;
        for(int i=0;i<chars.length;i++)
        {
            char c=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==c)
            {
                count++;
                i++;
            }
            chars[res++]=c;
            if (count > 1) 
            {
                String temp=String.valueOf(count);
                for (int j=0;j<temp.length();j++) 
                {
                    chars[res++] = temp.charAt(j);
                }
            }
            i--;
        }
        return res;
    }
}
