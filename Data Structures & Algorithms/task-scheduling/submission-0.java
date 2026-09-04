class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character , Integer> mp = new HashMap<>();
        for(char ch : tasks){
            mp.put(ch , mp.getOrDefault(ch , 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : mp.values()) pq.offer(val);
        Queue<int[]> cool = new LinkedList<>();
        int time =0;
        while(!pq.isEmpty() || !cool.isEmpty()){
            time++;
            if(!cool.isEmpty() && cool.peek()[1] == time){
                pq.offer(cool.poll()[0]);
            }
            if(!pq.isEmpty()){
                int temp = pq.poll();
                temp--;
                if(temp > 0) cool.offer(new int[]{temp , time+n+1});
            }
        }
        return time;
    }
}
