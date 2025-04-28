//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.countFriendsPairings(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long countFriendsPairings(int n) {
        if(n==1||n==2){
            return n;
        }
        return countFriendsPairings(n-1)+(n-1)*countFriendsPairings(n-2);
        // code here
        
    }
}
