// User function Template for Java
import java.util.*;
class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        int cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(cur==k){
                max=i+1;
            }
            if(map.containsKey(cur-k)){
                int index=map.get(cur-k);
                max=Math.max(max,i-index);
            }
            if(!map.containsKey(cur)){
                map.put(cur,i);
            }
        }
        return max;
        
        
    }
}
