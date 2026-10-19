class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        int ind[] = new int[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            for(int ele: graph[i]){
                adj.get(ele).add(i);
                ind[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ind[i] == 0) q.add(i);
        }
        while(!q.isEmpty()){
            int top = q.remove();
            arr.add(top);
            for(int neigh: adj.get(top)){
                ind[neigh]--;
                if(ind[neigh] == 0){
                    q.add(neigh);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}