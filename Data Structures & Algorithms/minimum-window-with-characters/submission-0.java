class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i=0; i<m; i++){
            mp.put(t.charAt(i) , mp.getOrDefault(t.charAt(i) , 0)+1);
        }
        int left =0;
        int len =0;
        int minlen = Integer.MAX_VALUE;
        int count =0;
        int start = 0;
        for(int right =0;right < n; right++){
            char ch = s.charAt(right);
            if(mp.containsKey(ch)){
                if (mp.get(ch) > 0) {
                    count++;
                }
                mp.put(ch, mp.get(ch) - 1);
            }
            while(count == m){
                if(right-left+1 < minlen){
                    minlen = right-left+1;
                    start = left;
                }
                char lch = s.charAt(left);
                if(mp.containsKey(lch)){
                    mp.put(lch , mp.get(lch)+1);
                    if(mp.get(lch) > 0) count--;
                }
                left++;
            }
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start , start+minlen);
    }
}
