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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int f=0;
        int t=0;
        for(int bill:bills){
            if(bill==5){
                f++;
            }else if(bill==10){
                if(f>0){
                    f--;
                    t++;
                }else{
                    return false;
                }
            }else{
                if(t>0&&f>0){
                    f--;
                    t--;
                }else if(f>2){
                    f-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
        // code here
    }
}
