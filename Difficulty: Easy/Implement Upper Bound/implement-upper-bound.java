class Solution {
    int upperBound(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int ans=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){
                right=mid-1;
                ans=mid;
            }else{
                left=mid+1;
            }
        }
        return ans;
        // code here
        
    }
}
