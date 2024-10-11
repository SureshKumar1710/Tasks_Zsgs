class Solution {
    public String frequencySort(String s) 
    {
        int[] arr=new int[127];
        for(int i=0;i<s.length();i++)
        {
            int n=(int)s.charAt(i);
            arr[n]++;
        }
        int max=0,ind=0;
        StringBuilder sb=new StringBuilder();
        int limit=Math.min(s.length(),127);
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<127;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    ind=j;
                }
            }
            for(int j=0;j<max;j++)
            {
                char c=(char)ind;
                sb.append(c);
            }
            max=0;
            arr[ind]=0;
        }
        return sb.toString();
    }
}
