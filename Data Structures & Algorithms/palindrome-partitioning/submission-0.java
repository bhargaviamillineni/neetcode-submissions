class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(ans , s , 0 , new ArrayList<>());
        return ans;
    }
    public void solve(List<List<String>> ans , String s, int idx , ArrayList<String> cur){
        if(idx == s.length()){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i =idx ; i<s.length(); i++){
            if(isPalindrome(s, idx , i)){
                String str = s.substring(idx , i+1);
                cur.add(str);
                solve(ans , s, i+1, cur);
                cur.remove(cur.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s , int l ,int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
