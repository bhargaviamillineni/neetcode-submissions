class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n+m];
        for(int i=0; i<n; i++){
            res[i] = nums1[i];
        }
        for(int i =n; i<n+m; i++){
            res[i] = nums2[i-n];
        }
        Arrays.sort(res);
        double ans = 0;
        if((n+m)%2 != 0){
            int mid = (n+m)/2;
            ans = res[mid];
        }else{
            int mid = (n+m)/2;
            ans = (res[mid-1]+res[mid])/2.0;
        }
        return ans;
    }
}
