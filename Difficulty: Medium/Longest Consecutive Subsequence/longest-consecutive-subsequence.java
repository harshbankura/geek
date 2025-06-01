class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int max=0;
        for(int j:arr){
            if(!set.contains(j-1)){
                int cur=1;
                int el=j;
                while(set.contains(el+1)){
                    cur++;
                    el++;
                }
                max=Math.max(cur,max);
                
            }
        }
        return max;
        
        // code here
        
    }
}