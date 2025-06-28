class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int V = adj.size();
        boolean vis[]= new boolean[V];
        
        vis[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            int curr= q.poll();
            ans.add(curr);
            for(int neigh:adj.get(curr)){
                if(!vis[neigh]){
                    q.add(neigh);
                    vis[neigh]=true;
                }
            }
        }
        return ans;
        // code here
        
    }
}