//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
      static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] vis = new boolean[V]; // Visited array
        int provinces = 0;

        // Loop through all cities
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {  // If city is not visited, it's a new province
                dfs(i, adj, vis, V);
                provinces++;
            }
        }
        return provinces;
    }

    // DFS function to mark all connected cities
    static void dfs(int city, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int V) {
        vis[city] = true;
        
        for (int neighbor = 0; neighbor < V; neighbor++) {
            if (adj.get(city).get(neighbor) == 1 && !vis[neighbor]) {
                dfs(neighbor, adj, vis, V);
            }
        }
    }
};