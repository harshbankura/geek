class Solution {
    public int getSecondLargest(int[] arr) {
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>large){
                slarge=large;
                large=i;
            }else if(i<large&&i>slarge){
                slarge=i;
            }
            
        }
        if(slarge==Integer.MIN_VALUE){
            return -1;
        }else{
            return slarge;
        }
        // code here
        
    }
}