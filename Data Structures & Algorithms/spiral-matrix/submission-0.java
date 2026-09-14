class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int t = 0;
        int l =0;
        int r = m-1;
        int b = n-1;
        while(l <= r && t <= b){
            for(int i=l ; i<= r; i++){
                ans.add(matrix[t][i]);
            }
            t++;
            for(int i= t; i<= b; i++) ans.add(matrix[i][r]);
            r--;
            if(t <= b){
                for(int i= r; i>= l; i--) ans.add(matrix[b][i]);
                b--;
            }
            if(l <= r){
                for(int i = b; i>=t; i--) ans.add(matrix[i][l]);
                l++;
            }
        }
        return ans;
    }
}
