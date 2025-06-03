// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        int low=0;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            long pow=power(mid,n,m);
            if(pow==m)return mid;
            else if(pow>m){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
        
        // code here
        
    }
    private long power(int num,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans*=num;
            if(ans>m)return ans;
        }
        return ans;
    }
}