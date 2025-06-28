
class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        
        // build
        
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        // dfs
        
        boolean vis[]= new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i,vis,component,adj);
                components.add(component);
            }
        }
        return components;
        // code here
        
    }
    private void dfs(int i , boolean vis[],ArrayList<Integer> component,ArrayList<ArrayList<Integer>> adj){
        vis[i]=true;
        component.add(i);
        for(int neigh :adj.get(i)){
            if(!vis[neigh]){
                dfs(neigh,vis,component,adj);
            }
        }
        
    }
}