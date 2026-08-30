class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones) pq.offer(s);
        while(pq.size() > 1){
            int ele1 = pq.poll();
            int ele2 = pq.poll();
            if(ele1 == ele2) continue;
            if(ele2 < ele1) pq.offer(ele1-ele2); 
        }
        return (pq.isEmpty()) ? 0: pq.peek();
    }
}
