class TimeMap {
    HashMap<String, List<Integer>> time = new HashMap<>();
    HashMap<String, List<String>> val = new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!time.containsKey(key)){
            time.put(key, new ArrayList<>());
            val.put(key, new ArrayList<>());
        }
        time.get(key).add(timestamp);
        val.get(key).add(value);
    }
    
    public String get(String key, int timestamp) {
        if (!time.containsKey(key)) return "";
        String ans = "";
        List<Integer> lst = time.get(key);
        List<String> sls = val.get(key);
        int left = 0;
        int right = lst.size()-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(lst.get(mid) <= timestamp){
                ans = sls.get(mid);
                left = mid+1;
            }else right = mid-1;
        }
        return ans;
    }
}
