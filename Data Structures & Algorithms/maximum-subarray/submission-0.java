class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = nums[0];
        int curmax = nums[0];
        for(int i=1; i<n; i++){
            curmax = Math.max(curmax+nums[i] , nums[i]);
            maxsum = Math.max(maxsum , curmax);
        }
        return maxsum;
    }
}
