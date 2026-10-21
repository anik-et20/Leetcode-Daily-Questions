class Trip{
    int child;
    int par;
    int cost;
    Trip(int child, int par, int cost){
        this.child = child;
        this.par = par;
        this.cost = cost;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean visit[] = new boolean[n];
        PriorityQueue<Trip> pq = new  PriorityQueue<>((a,b)->Integer.compare(a.cost,b.cost));
        pq.add(new Trip(0,-1,0));
        int sum = 0;
        while(!pq.isEmpty()){
            Trip top = pq.remove();
            int c = top.child, p = top.par, dist = top.cost;
            if(visit[c]) continue;
            visit[c] = true;
            sum += dist;

            for(int i=0; i<n; i++){
                if(visit[i] == true){
                    continue;
                }
                int x1 = points[i][0],  y1 = points[i][1];
                int x2 = points[c][0],  y2 = points[c][1];
                int val = Math.abs(x1-x2) + Math.abs(y1-y2);
                pq.add(new Trip(i, c, val));
            }
        }
        return sum;
    }
}