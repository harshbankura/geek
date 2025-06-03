/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
        if(n==0||n==1) return n;
        int low=0;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sq=(long) mid*mid;
            if(sq==n)return mid;
            else if(sq<n){
                ans=mid;
                low=mid+1;
                
            }else{
                high=mid-1;
            }
        }
        return ans;
        // Your code here
        
    }
}