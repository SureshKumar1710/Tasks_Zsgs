class Solution {
    public void moveZeroes(int[] nums) 
    {
        int zeroIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            while(zeroIndex<nums.length && nums[zeroIndex]!=0)
                zeroIndex++;
            if(zeroIndex>i)
                i=zeroIndex+1;
            if(i<nums.length && nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=0;
                nums[zeroIndex]=temp;
            }
        }    
    }
}
