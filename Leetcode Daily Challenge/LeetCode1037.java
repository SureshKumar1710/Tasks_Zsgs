class Solution {
    public boolean isBoomerang(int[][] points) 
    {
        int x1=points[0][0], x2=points[1][0], x3=points[2][0];
        int y1=points[0][1], y2=points[1][1], y3=points[2][1];
        int temp1=(x1-x2)*(y1-y3);
        int temp2=(x1-x3)*(y1-y2);
        return temp1!=temp2;
    }
}
