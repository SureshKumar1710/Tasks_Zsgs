class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res, 1);
        int multiplier = 1;
        for(int i = 0; i < n; i++) 
        {
            res[i] *= multiplier;
            multiplier *= nums[i];
        }
        multiplier = 1;
        for(int i = n - 1; i >= 0; i--) 
        {
            res[i] *= multiplier;
            multiplier *= nums[i];
        }
        return res;
    }
}
