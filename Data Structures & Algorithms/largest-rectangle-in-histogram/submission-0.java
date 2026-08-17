class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            pse[i] = st.isEmpty()?-1 : st.peek();
            st.push(i);
        }
        st.clear();
        for(int i = n-1; i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        int maxarea = 0;
        for(int i=0; i<n; i++){
            int wid = nse[i] - pse[i]-1;
            int hei = heights[i];
            maxarea = Math.max(maxarea , wid*hei);
        }
        return maxarea;
    }
}
