class Solution {
    public static int subarrayBitwiseORs(int[] arr) 
    {
        Set<Integer> s=new HashSet<>();
		int[] res=new int[arr.length];
		Arrays.fill(res, -1);
        for(int i=0;i<arr.length;i++)
        {
        	int prev=0;
        	for(int j=i;j<arr.length;j++)
        	{
        		prev=prev | arr[j];
        		if(prev==res[j])
        			break;
        		else
        			res[j]=prev;
        		s.add(prev);
        	}   
        }
        return s.size();
    }
}
