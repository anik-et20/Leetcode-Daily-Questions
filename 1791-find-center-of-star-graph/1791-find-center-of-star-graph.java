class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int visit[] = new int[n+2];
        for(int i=0; i<n; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            visit[u]++;
            visit[v]++;
            if(visit[u] == 2) return u;
            if(visit[v] == 2) return v;
        }
        return -1;
    }
}