class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        int pre = 1;
        int pos = 1;
        for(int i=1; i<n; i++){
            pre = pre * nums[i-1];
            res[i] = pre;
        }
        for(int i = n-2; i>=0; i--){
            pos = pos*nums[i+1];
            res[i] *= pos;
        }
        return res;
    }
}  
