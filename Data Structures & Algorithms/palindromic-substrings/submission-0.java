class Solution {
    public int countSubstrings(String s) {
        int c =0;
        for(int i=0; i<s.length(); i++){
            c += expand(s , i ,i);
            c+= expand(s , i, i+1);
        }
        return c;
    }
    public int expand(String s , int left , int right){
        int cnt =0;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}
