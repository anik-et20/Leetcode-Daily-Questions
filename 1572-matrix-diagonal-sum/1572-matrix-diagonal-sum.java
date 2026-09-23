class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
        }
        if(n%2 != 0){
            int q = n/2;
            sum -= mat[q][q];
        }
        int s = 0;
        for(int j=n-1; j>=0; j--){
            sum += mat[s][j];
            s++;
        }
        return sum;
    }
}