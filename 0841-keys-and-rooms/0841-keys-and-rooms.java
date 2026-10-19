class Solution {
    public boolean bfs(List<List<Integer>> rooms, int curr){
        boolean visit[] = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(curr);
        while(!q.isEmpty()){
            int top = q.remove();
            visit[top] = true;
            for(int neigh: rooms.get(top)){
                if(!visit[neigh]){
                    q.add(neigh);
                }
            }
        }
        for(boolean i: visit){
            if(i == false) return false;
        }
        return true;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return bfs(rooms, 0);
    }
}