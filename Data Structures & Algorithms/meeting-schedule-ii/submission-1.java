/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        if(n == 0 || intervals == null) return 0;
        Collections.sort(intervals, (a, b)-> Integer.compare(a.start , b.start));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(intervals.get(0).end);
        for(int i=1; i<n; i++){
            int s = intervals.get(i).start;
            int e = intervals.get(i).end;
            if(s >= pq.peek()) pq.poll();
            pq.add(e);
        }
        return pq.size();
    }
}
