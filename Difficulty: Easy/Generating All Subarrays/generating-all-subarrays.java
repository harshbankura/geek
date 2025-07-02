// User function Template for Java
class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                list.add(arr[j]);
                ans.add(new ArrayList<>(list));
                
            }
        }
        return ans;
    }
}