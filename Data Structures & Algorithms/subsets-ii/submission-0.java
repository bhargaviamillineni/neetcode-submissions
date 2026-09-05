class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums , ans , 0 , new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums , List<List<Integer>> ans , int idx , ArrayList<Integer> cur){
        if(idx == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[idx]);
        solve(nums , ans , idx+1, cur);
        cur.remove(cur.size()-1);
        while(idx+1 < nums.length && nums[idx] == nums[idx+1]) idx++;
        solve(nums , ans , idx+1, cur);
    }
}
