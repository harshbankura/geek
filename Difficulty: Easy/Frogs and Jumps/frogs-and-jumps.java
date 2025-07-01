// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        boolean[] vis = new boolean[leaves+1];
        Set<Integer> uniqueStrengths = new HashSet<>();

        for(int frog:frogs){
              if (frog == 0 || uniqueStrengths.contains(frog)) continue;

            uniqueStrengths.add(frog);
            for(int i=frog;i<=leaves;i+=frog){
                vis[i]=true;
            }
            
        }
        int count=0;
        
        for(int i=1;i<=leaves;i++){
        if(!vis[i]){
            count++;
        }    
        }
        return count;
        // Code here
        
    }
}
