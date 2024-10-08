class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, max = 0;
        while (i < nums.length) 
        {
            if (nums[i] == 1) 
            {
                i++;
            } 
            else 
            {
                if (k > 0) 
                {
                    k--;
                    i++;
                } 
                else 
                {
                    if (nums[j] == 0) 
                    {
                        k++;
                    }
                    j++;
                }
            }
            max = Math.max(max, i - j);
        }
        return max;
    }
}
