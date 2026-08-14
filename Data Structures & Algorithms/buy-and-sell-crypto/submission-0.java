class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int pro = prices[0];
        int res =0;
        for(int i=0; i<n; i++){
            pro = Math.min(pro , prices[i]);
            res = Math.max(res , prices[i] - pro);
        }
        return res;
    }
}
