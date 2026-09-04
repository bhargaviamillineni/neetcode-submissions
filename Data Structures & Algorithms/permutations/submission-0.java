class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solve(nums , ans , 0 , new ArrayList<>() , used);
        return ans;
    }
    public void solve(int[] nums , List<List<Integer>> ans , int idx , ArrayList<Integer> cur , boolean[] used){
        if(idx == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            cur.add(nums[i]);
            used[i] = true;
            solve(nums, ans, idx + 1, cur, used);
            used[i] = false;
            cur.remove(cur.size() - 1);
        }
    }
}
