class Pair{
    int r;
    int c;
    int v;
    Pair(int r, int c, int v){
        this.r = r;
        this.c = c;
        this.v = v;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int effort[][] = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                effort[i][j] = Integer.MAX_VALUE;
            }
        }
        effort[0][0] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.v, b.v));
        pq.add(new Pair(0,0,0));

        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,1,-1};
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            int top_r = top.r;
            int top_c = top.c;
            int top_val = top.v;
            
            for(int k=0; k<4; k++){
                int nr = top_r + dr[k];
                int nc = top_c + dc[k];

                if(nr<0 || nr>=m || nc<0 || nc>=n){
                    continue;
                }
                    
                int diff = Math.abs(heights[nr][nc] - heights[top_r][top_c]);
                int newEffort = Math.max(top_val, diff);                  
                if(newEffort < effort[nr][nc]){
                    effort[nr][nc] = newEffort;  
                    pq.add(new Pair(nr,nc, newEffort));
                }
            }
        }
        return effort[m-1][n-1];
    }
}