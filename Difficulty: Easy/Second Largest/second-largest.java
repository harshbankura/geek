class Solution {
    public int getSecondLargest(int[] arr) {
        int large=Integer.MIN_VALUE;
        int slarge=-1;
        for(int i:arr){
            if(i>large){
                slarge=large;
                large=i;
            }else if(i!=large && i>slarge){
                slarge=i;
            }
        }
        return slarge<0?-1:slarge;
        // code here
        
    }
}