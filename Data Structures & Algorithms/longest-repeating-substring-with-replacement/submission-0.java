class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character , Integer> mp = new HashMap<>();
        int left =0;
        int freq =0;
        int maxlen =0;
        for(int right =0; right <n; right++){
            char ch = s.charAt(right);
            mp.put(ch , mp.getOrDefault(ch , 0)+1);
            freq = Math.max(freq , mp.get(ch));
            while((right-left+1) - freq > k){
                mp.put(s.charAt(left) , mp.get(s.charAt(left)) -1);
                left++;
            }
            maxlen = Math.max(maxlen , right-left+1);
        }
        return maxlen;
    }
}
