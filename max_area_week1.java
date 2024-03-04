class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length-1;

        int area = 0;
        while(p1 <= p2){
            int temp = Math.min(height[p1],height[p2]) * (p2-p1);
            if(area < temp) 
                area = temp;
            if(height[p1] <= height[p2])
                p1++;
            else
                p2--;
        }
        return area;
        
    }
}