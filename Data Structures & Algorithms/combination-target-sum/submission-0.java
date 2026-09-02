class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums , ans , 0 , target , new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums , List<List<Integer>> ans, int idx , int tar , ArrayList<Integer> cur){
        if(idx == nums.length ){
            if(tar == 0){
                ans.add(new ArrayList<>(cur));
            }
            return;
        }
        if (idx == nums.length || tar < 0) {
            return;
        }
        cur.add(nums[idx]);
        solve(nums , ans , idx , tar-nums[idx] , cur);
        cur.remove(cur.size()-1);
        solve(nums , ans , idx+1, tar , cur);
    }
}
