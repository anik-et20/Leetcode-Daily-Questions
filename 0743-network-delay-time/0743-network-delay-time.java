class Solution {
    class Pair{
        int e;
        int dis;
        Pair(int e, int dis){
            this.e = e;
            this.dis = dis;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<times.length; i++){
            int s = times[i][0];
            int e = times[i][1];
            int d = times[i][2];

            adj.get(s).add(new Pair(e, d));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.dis, b.dis));
        int dist[] = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        pq.add(new Pair(k, 0));
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            int src = top.e;
            int cost = top.dis;

            for(Pair p: adj.get(src)){
                int total = cost + p.dis;
                if(total < dist[p.e]){
                    dist[p.e] = total;
                    pq.add(new Pair(p.e, total));
                }
            }

        }
        int ans = 0;
        for(int i=1; i<=n; i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            ans = Math.max(dist[i], ans);
        }
        return ans;

    }
}