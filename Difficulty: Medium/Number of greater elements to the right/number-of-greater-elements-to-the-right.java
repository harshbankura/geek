// User function Template for Java

class Solution {
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        int[] result = new int[queries];
        for(int i=0;i<queries;i++){
            int index=indices[i];
            int target=arr[index];
            int count=0;
            for(int j=index+1;j<=arr.length-1;j++){
                if(arr[j]>target){
                    count++;
                }
            }
            result[i]=count;
            
        }
        return result;
        // code here
        
    }
}
