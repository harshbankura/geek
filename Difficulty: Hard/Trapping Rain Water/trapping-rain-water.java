class Solution {
    public int maxWater(int arr[]) {
        int n=arr.length;
        int lgreater[]= new int[arr.length];
        int rgreater[]= new int[arr.length];
        lgreater[0]=arr[0];
        rgreater[n-1]=arr[n-1];
        int greater=arr[0];
        for(int i=1;i<n;i++){
            lgreater[i]=Math.max(greater,arr[i]);
            greater=Math.max(greater,arr[i]);
            
        }
        greater=arr[n-1];
        for(int j=n-2;j>=0;j--){
            rgreater[j]=Math.max(greater,arr[j]);
            greater=Math.max(greater,arr[j]);
            
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(lgreater[i],rgreater[i])-arr[i];
        }
        return sum;
        
        // code here
        
    }
}
