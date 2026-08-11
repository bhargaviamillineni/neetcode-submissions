class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums) set.add(val);
        int res =0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int ele = num;
                int c =1;
                while(set.contains(ele+1)){
                    ele++;
                    c++;
                }
                res = Math.max(res , c);
            }
        }return res;
    }
}
