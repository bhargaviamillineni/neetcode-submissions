class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates , ans , 0 , target , new ArrayList<>());
        return ans;
    }
    public void solve(int[] arr , List<List<Integer>> ans , int idx , int tar , ArrayList<Integer> cur){
        if(idx == arr.length){
            if(tar == 0) ans.add(new ArrayList<>(cur));
            return;
        }
        if(idx == arr.length || tar < 0) return;
        cur.add(arr[idx]);
        solve(arr , ans , idx+1 , tar-arr[idx] , cur);
        cur.remove(cur.size()-1);
        while(idx+1 < arr.length && arr[idx] == arr[idx+1]) idx++;
        solve(arr , ans , idx+1, tar , cur);
    }
}
