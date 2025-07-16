class Solution {
     public boolean graphColoring(int v, int[][] edges, int m) {
        // Step 1: Create adjacency matrix
        int[][] graph = new int[v][v];
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1; // Since the graph is undirected
        }

        // Step 2: Create color array
        int[] color = new int[v];

        // Step 3: Use backtracking to solve
        return solve(0, graph, color, m, v);
    }

    private boolean solve(int node, int[][] graph, int[] color, int m, int v) {
        if (node == v) {
            return true; // All vertices are colored
        }

        for (int c = 1; c <= m; c++) {
            if (isSafe(node, graph, color, c, v)) {
                color[node] = c; // Assign color
                if (solve(node + 1, graph, color, m, v)) {
                    return true; // If coloring is possible from here
                }
                color[node] = 0; // Backtrack
            }
        }

        return false; // No color could be assigned to this node
    }
     private boolean isSafe(int node, int[][] graph, int[] color, int c, int v) {
        for (int i = 0; i < v; i++) {
            if (graph[node][i] == 1 && color[i] == c) {
                return false; // Adjacent vertex has the same color
            }
        }
        return true;
    }
}