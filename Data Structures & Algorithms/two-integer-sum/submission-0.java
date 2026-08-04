class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            int sum = nums[i];
            int rem = target - sum;
            if(mp.containsKey(rem)){
                return new int[]{mp.get(rem) , i};
            }
            mp.put(sum , i);
        }
        return new int[]{-1 ,-1};
    }
}
