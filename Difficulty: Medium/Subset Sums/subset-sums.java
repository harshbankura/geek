// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans = new  ArrayList<>();
        work(0,0,arr,ans);
        return ans;
        // code here
        
    }
    private static void work(int index,int sum , int[] arr , ArrayList<Integer> ans ){
    if(index==arr.length){
        ans.add(sum);
        return;
    }
    work(index+1,sum+arr[index],arr,ans);
    
    work(index+1,sum,arr,ans);}
    
}