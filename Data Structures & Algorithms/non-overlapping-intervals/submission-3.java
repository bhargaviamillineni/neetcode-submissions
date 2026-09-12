class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int n = intervals.length;
        int s = intervals[0][0];
        int e = intervals[0][1];
        int c =0;
        for(int i=1; i<n; i++){
            if(intervals[i][0] < e){
                c++;
                e = Math.min(e , intervals[i][1]);
            }else e = intervals[i][1];
        }
        return c;
    }
}
