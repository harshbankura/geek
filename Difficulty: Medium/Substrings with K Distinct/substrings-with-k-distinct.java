//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            System.out.println(new Solution().countSubstr(s, k));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countSubstr(String s, int k) {
        return ans(s,k)-ans(s,k-1);
        
        // your code here
    }
    private int ans(String s,int k){
        if(k==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        for(right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
            char leftc= s.charAt(left);
            map.put(leftc,map.get(leftc)-1);
            if(map.get(leftc)==0){
                map.remove(leftc);
            }
            left++;
        }
        count+=right-left+1;
        }
        return count;
        
    }
}