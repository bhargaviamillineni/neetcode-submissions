class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tank =0;
        int tot =0;
        int start = 0;
        for(int i=0; i<n; i++){
            tank += gas[i] - cost[i];
            tot += gas[i] - cost[i];
            if(tank < 0){
                start = i+1;;
                tank =0;
            }
        }
        return tot < 0 ? -1 : start;
    }
}
