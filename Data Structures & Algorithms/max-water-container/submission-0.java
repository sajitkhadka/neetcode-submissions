class Solution {
    public int maxArea(int[] heights) {
        int l =0, r=heights.length-1;
        int maxArea = 0;
        while(l < r){
            int lh = heights[l];
            int rh = heights[r];
            int d = r - l;
            maxArea = Math.max(maxArea,d * Math.min(lh, rh));
            if(lh > rh) r--;
            else l++;
        }
        return maxArea;
    }
}
