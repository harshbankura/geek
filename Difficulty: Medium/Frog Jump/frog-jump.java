// User function Template for Java
class Solution {
    int minCost(int[] height) {
        int n=height.length;
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){
            int step1= prev + Math.abs(height[i]-height[i-1]);
            int step2=Integer.MAX_VALUE;
            if(i>1){
                step2=prev2+Math.abs(height[i]-height[i-2]);
            }
            int curr=Math.min(step1,step2);
            prev2=prev;
            prev=curr;
        }
        return prev;
        // code here
        
    }
}