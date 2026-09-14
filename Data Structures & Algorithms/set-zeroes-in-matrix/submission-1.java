class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] rz = new boolean[n];
        boolean[] cz = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=0 ; j<m; j++){
                if(matrix[i][j] == 0){
                    rz[i] = true;
                    cz[j] = true;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(rz[i] || cz[j]) matrix[i][j] = 0;
            }
        }
    }
}
