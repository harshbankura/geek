//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            long topDownans = obj.topDown(n);
            long bottomUpans = obj.bottomUp(n);
            if (topDownans != bottomUpans)
                System.out.println(-1);
            else
                System.out.println(topDownans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static final int mod= 1000000007;

    static long topDown(int n) {
        long dp[] = new long[n+1];
        return helpDp(n,dp);
        
        // code here
    }
    private static long helpDp(int n,long dp[]){
        if(n<2){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=(helpDp(n-1,dp)+helpDp(n-2,dp))%mod;
        return dp[n];
    }

    static long bottomUp(int n) {
        long dp[]= new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%mod;
        }
        return dp[n];
        // code here
    }
}
