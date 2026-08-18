class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left =1;
        int right = 0;
        int ans = -1; 
        for(int num : piles) right = Math.max(right , num);
        while(left <= right){
            int mid = left+(right-left)/2;
            if(Possible(piles , mid , h)){
                ans = mid;
                right = mid-1;
            }
            else left = mid+1;
        }
        return ans;
    }
    public boolean Possible(int[] piles , int k , int h){
        int c =0;
        for(int num : piles){
            c += Math.ceil((double)num/k);
        }
        if(c <= h) return true;
        return false;
    }
}
