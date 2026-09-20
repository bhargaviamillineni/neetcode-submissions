class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> res = new ArrayList<>();
        HashMap<Character , Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            mp.put(ch , i);
        }
        int len =0;
        int e = 0;
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
            len++;
            e = Math.max(e , mp.get(ch));
            if(i == e){
                res.add(len);
                len =0;
            }
        }
        return res;
    }
}
