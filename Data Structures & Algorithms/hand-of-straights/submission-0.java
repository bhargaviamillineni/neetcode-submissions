class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int n = hand.length;
        if(n%groupSize != 0) return false;
        for(int num : hand) mp.put(num , mp.getOrDefault(num , 0) +1);
        Arrays.sort(hand);
        for(int i=0; i<n; i++){
            if(!mp.containsKey(hand[i])) continue;
            for(int j=0; j<groupSize; j++){
                int num = hand[i] + j;
                if(!mp.containsKey(num)) return false;
                mp.put(num , mp.get(num)-1);
                if(mp.get(num) == 0) mp.remove(num);
            }
        }
        return true;
    }
}
