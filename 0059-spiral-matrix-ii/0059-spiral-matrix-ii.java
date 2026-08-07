class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int ans = 1;
        int sr = 0, sc = 0;
        int er = n-1, ec = n-1;
        while(sr<=er && sc<=ec){
            for(int i=sc; i<=ec; i++){
                arr[sr][i] = ans;
                ans++;
            }
            for(int j=sr+1; j<=er; j++){
                arr[j][ec] = ans;
                ans++;
            }
            for(int i=ec-1; i>=sr; i--){
                arr[er][i] = ans;
                ans++;
            }
            for(int j=er-1; j>=sr+1; j--){
                arr[j][sc] = ans;
                ans++;
            }
            sr++; sc++;
            er--; ec--;
        }
        return arr;
    }
}