class Solution {
    public boolean bfs(List<List<Integer>> adj, int src, int dest, boolean visit[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visit[src] = true;
        while(!q.isEmpty()){
            int top = q.remove();
            if(top == dest) return true;
            for(int neigh: adj.get(top)){
                if(!visit[neigh]){
                    visit[neigh] = true;
                    q.add(neigh);
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visit[] = new boolean[n];
        return bfs(adj, source, destination, visit);
    }
}