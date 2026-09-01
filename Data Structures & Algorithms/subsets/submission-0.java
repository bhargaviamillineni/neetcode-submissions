class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums , 0 , ans , new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums , int idx , List<List<Integer>> ans , List<Integer> cur){
        if(idx == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[idx]);
        solve(nums , idx+1, ans , cur);
        cur.remove(cur.size()-1);
        solve(nums, idx+1, ans , cur);
    }
}
