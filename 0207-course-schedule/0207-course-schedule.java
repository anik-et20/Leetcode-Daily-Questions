class Solution {
    static boolean ans;
    public void dfs(int curr, List<List<Integer>> adj, boolean visit[], boolean path[]){
        visit[curr] = true;
        path[curr] = true;
        for(int neigh: adj.get(curr)){
            if(path[neigh] == true){
                ans = false;
                return;
            }
            if(!visit[neigh]){
                dfs(neigh, adj, visit, path);

            }
        }
        path[curr] = false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ans = true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<prerequisites.length; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(v).add(u);
        }
        boolean visit[] = new boolean[numCourses];
        boolean path[] = new boolean[numCourses];
        for(int i=0; i<n; i++){
            if(!visit[i]){
                dfs(i, adj, visit, path);
            }
        }
        return ans;
    }
}