class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0,j=arr.length-1,flag=0,flag1=0;
        if(j<2)
            return false;
        while(i<j)
        {
            if(arr[i]<arr[i+1])
            {
                i++;
                flag=1;
            }
            else if(arr[j]<arr[j-1])
            {
                j--;
                flag1=1;
            } 
            else return false;
        }
        if(flag==1 && flag1==1)
            return true;
        return false;
    }
}
