class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length,carry=1;
        for(int i=n-1;i>=0;i--)
        {
            int temp=digits[i]+carry;
            if(temp!=10)
            {
                digits[i]=temp;
                break;
            }
            digits[i]=0;
        }
        if(digits[0]==0)
        {
            int[] res=new int[n+1];
            res[0]=1;
            for(int i=1;i<=n;i++)
            {
                res[i]=digits[i-1];
            }
            return res;
        }
        return digits;
    }
}
