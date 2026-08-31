class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int[] p : points){
            int dis = p[0]*p[0] + p[1]*p[1];
            pq.offer(new int[]{dis , p[0] , p[1]});
            while(pq.size() > k) pq.poll();
        }
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            int[] cur = pq.poll();
            ans[i][0] = cur[1];
            ans[i][1] = cur[2];
        }
        return ans;
    }
}
