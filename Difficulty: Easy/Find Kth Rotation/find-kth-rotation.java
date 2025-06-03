// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            
        int mid=left+(right-left)/2;
        if(arr.get(mid)>arr.get(right)){
            left=mid+1;
        }else{
            right=mid;
        }
            
        }
        return left;
        // Code here
        
    }
}