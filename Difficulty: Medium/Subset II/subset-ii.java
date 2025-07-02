// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        work(0,nums, ans , new ArrayList<>());
        return ans;
    }
    private static void work(int index, int[] nums ,ArrayList<ArrayList<Integer>> ans ,ArrayList<Integer> ds ){
        if(index==nums.length){
            ans.add(new ArrayList(ds));
            return;
        }
        ds.add(nums[index]);
        work(index+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        
        
        int next = index+1;
        while(next<nums.length&&nums[next]==nums[index]){
            next++;
        }
        work(next,nums,ans,ds);
    }
}