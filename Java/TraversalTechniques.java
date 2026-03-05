class Solution {
    private void dfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> ans) {
        vis[node] = true;
        ans.add(node);

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(neighbor, adj, vis, ans);
            }
        }
    }
     public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis, ans);
            }
        }

        return ans;
    }
    private void bfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> ans){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        vis[node]=true;
        while(!q.isEmpty()){
            int current=q.poll();
            ans.add(current);

            for(int neighbour: adj.get(current)){
                if(!vis[neighbour]){
                    vis[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
    }
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        boolean[] vis=new boolean[V];
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<V;i++){
            if(!vis[i]){
                bfs(i,adj,vis,ans);
            }
        }
        return ans;
    }
}

