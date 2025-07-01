// User function template for JAVA

class Solution {
    // Function to find all combinations of elements
    // in array arr that sum to target.
    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        work(0,arr,target, ans, new ArrayList<>());
        return ans;
        // add your code here
    }
    private static void work(int index, int[] arr, int target ,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds ){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (index == arr.length) {
            return;
        }
        if(target>=arr[index]){
            ds.add(arr[index]);
            work(index,arr,target-arr[index], ans , ds );
            ds.remove(ds.size() - 1);
        }
        
            work(index+1,arr,target, ans , ds );
        
    }
}