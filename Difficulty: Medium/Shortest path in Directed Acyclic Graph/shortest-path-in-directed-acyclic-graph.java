//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] edge = new int[m][3];
            for (int i = 0; i < m; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
                edge[i][2] = sc.nextInt();
            }
            Solution obj = new Solution();
            int res[] = obj.shortestPath(n, m, edge);
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
     private void dfs(int i,ArrayList<ArrayList<int[]>> adj ,boolean[] visited,Stack<Integer> st ){
        visited[i]=true;
        for(int[] edge : adj.get(i)){
            int neigh=edge[0];
            if(!visited[neigh]){
                dfs(neigh,adj,visited,st);
            }
        }
        st.push(i);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
            
        }
        for(int[] edge:edges){
            int s=edge[0];
            int d=edge[1];
            int wt=edge[2];
            adj.get(s).add(new int[]{d,wt});
        }
        boolean[] visited= new boolean[V];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,adj,visited,st);
            }
        }
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        while(!st.isEmpty()){
            int curr=st.pop();
            if(dist[curr]!=Integer.MAX_VALUE){
                for(int edge[]:adj.get(curr)){
                    int neigh=edge[0];
                    int wt=edge[1];
                    if(dist[neigh]>dist[curr]+wt){
                        dist[neigh]=dist[curr]+wt;
                        
                    }
                }
            }
            
            
            }
            for(int i=0;i<V;i++){
                if(dist[i]==Integer.MAX_VALUE){
                    dist[i]=-1;
                }
            }
             return dist;
            
        }
        
           
        
       
        // Code here
    }
    
   
