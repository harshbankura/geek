// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int small=Integer.MAX_VALUE;
        int ssmall=Integer.MAX_VALUE;
        
        for(int i:arr){
            if(i<small){
                ssmall=small;
                small=i;
                
            }
            else if(small<i&&i<ssmall){
                ssmall=i;
            }
            
            
        }
        if(ssmall==Integer.MAX_VALUE){
            return new int[]{-1};
        }
        return new int[]{small,ssmall};
        // code here
        
    }
}
