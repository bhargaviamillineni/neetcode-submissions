class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int ans = 0;
        if(n== 1) return nums[0];
        if(n == 2) return Math.max(nums[0] , nums[1]);
        if(n == 3) return Math.max(nums[0] , Math.max(nums[1] , nums[2]));
        int ans1 = solve(nums, 0 , n-2);
        int ans2 = solve(nums, 1, n-1);
        return Math.max(ans1, ans2);
    }
    public int solve(int[] nums , int i , int j){
        int prev1 = nums[i];
        int prev2 = Math.max(prev1 , nums[i+1]);
        for(int k = i+2; k<=j ; k++){
            int cur = Math.max(nums[k]+prev1 , prev2);
            prev1 = prev2;
            prev2 = cur;
        }
        return prev2;
    }
}
