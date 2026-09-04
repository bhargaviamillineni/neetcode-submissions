class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals , (a, b) -> a[0] - b[0]);
        int s = intervals[0][0];
        int e = intervals[0][1];
        for(int[] t : intervals){
            if(t[0] <= e){
                e = Math.max(e, t[1]);
                //ans.add(new int[]{s , e});
            }else{
                ans.add(new int[]{s , e});
                s = t[0];
                e = t[1];
            }
        }
        ans.add(new int[]{s, e});
        return ans.toArray(new int[ans.size()][2]);
    }
}
