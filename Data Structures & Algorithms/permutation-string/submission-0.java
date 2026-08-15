class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m) return false;
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i=0; i<n; i++){
            char ch = s1.charAt(i);
            f1[ch - 'a']++;
        }
        int left =0;
        for(int right =0; right < m; right++){
            char ch = s2.charAt(right);
            f2[ch-'a']++;
            if(right-left+1 > n){
                char c = s2.charAt(left);
                f2[c-'a']--;
                left++;
            }
            if(right-left+1 == n){
                if(Arrays.equals(f1, f2)) return true;
            }
        }
        return false;
    }
}
