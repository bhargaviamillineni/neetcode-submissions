class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        String[] map = {"", "" , "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(ans , 0 , digits , map , "");
        return ans;
    }
    public void solve(List<String> ans , int idx , String digits , String[] map , String s){
        if(idx == digits.length()){
            ans.add(s);
            return;
        }
        String letter = map[digits.charAt(idx) - '0'];
        for(char ch : letter.toCharArray()){
            solve(ans , idx+1, digits , map , s+ch);
        }
    }
}
