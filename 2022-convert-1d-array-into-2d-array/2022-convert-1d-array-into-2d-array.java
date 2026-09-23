class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][] = new int[m][n];
        int elements = m*n;
        int len = original.length;
        if(len > elements || len < elements){
            return new int[][]{};
        }
        int s = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(s == len) break;
                arr[i][j] = original[s];
                s++;
            }
        }
        return arr;
    }
}