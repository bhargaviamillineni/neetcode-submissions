class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = {-1, -1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            int sum = numbers[i];
            int rem = target- sum;
            if(mp.containsKey(rem)){
                res[0] = i+1;
                res[1] = mp.get(rem)+1;
            }
            mp.put(numbers[i] , i);
        }
        Arrays.sort(res);
        return res;
    }
}
