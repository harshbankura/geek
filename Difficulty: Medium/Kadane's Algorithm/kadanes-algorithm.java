class Solution {
    int maxSubarraySum(int[] arr) {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            curSum+=arr[i];
            maxSum=Math.max(maxSum,curSum);
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
        // Your code here
        
    }
}
