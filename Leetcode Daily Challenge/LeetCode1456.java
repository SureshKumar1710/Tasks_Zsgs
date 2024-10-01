class Solution {
    public int maxVowels(String s, int k) 
    {
        int start=0,max=0,count=0,br=0;
        for(int i=0;i<s.length();i++)
        {
            if(br==k)
            {
                if(count>max)
                    max=count;
                br--;
                if(isVowel(s.charAt(start)))
                    count--;
                start++;
            }
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            br++;
        }
        if(count>max)
        	max=count;
        return max;
    }
    public boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='u' || c=='o')
        {
            return true;
        }
        return false;
    }
}
