class Solution {
    public boolean isItPossible(String word1, String word2) 
    {
        int[] a=new int[26];
        int[] b=new int[26];
        for(char c: word1.toCharArray())
        {
            a[c-'a']++;  
        }    
        for(char c: word2.toCharArray())
        {
            b[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
                continue;
            for(int j=0;j<26;j++)
            {
                int c1=0,c2=0;
                if(b[j]==0)
                    continue;
                a[i]--;
                b[i]++;
                b[j]--;
                a[j]++;
                for(int k=0;k<26;k++)
                {
                    if(a[k]>0) c1++;
                    if(b[k]>0) c2++;
                }
                if(c1==c2) return true;
                a[i]++;
                b[i]--;
                b[j]++;
                a[j]--;
            }
        }
        return false;
    }
}
