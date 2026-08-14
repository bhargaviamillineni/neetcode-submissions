class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character , Integer> mp = new HashMap<>();
        int left =0;
        int maxlen =0;
        for(int right =0; right <n; right++){
            mp.put(s.charAt(right) , mp.getOrDefault(s.charAt(right) , 0)+1);
            while(mp.get(s.charAt(right)) > 1){
                mp.put(s.charAt(left) , mp.get(s.charAt(left)) -1);
                left++;
            }
            maxlen = Math.max(maxlen , right-left+1);
        }
        return maxlen;
    }
}
