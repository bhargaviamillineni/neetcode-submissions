class Solution {
    public int maxArea(int[] heights) {
        int  n = heights.length;
        int maxres = 0;
        int i=0;
        int j = n-1;
        while(i < j){
            int wid = j-i;
            int hei = Math.min(heights[i] , heights[j]);
            maxres = Math.max(maxres , hei*wid);
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return maxres;
    }
}
