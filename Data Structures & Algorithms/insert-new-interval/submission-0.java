class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int[] ls : intervals){
            if(ls[0] > newInterval[1]){
                ans.add(newInterval);
                newInterval = ls;
            }else if(ls[1] < newInterval[0]){
                ans.add(ls);
            }else{
                newInterval[0] = Math.min(ls[0], newInterval[0]);
                newInterval[1] = Math.max(ls[1], newInterval[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
