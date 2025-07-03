// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==i+1){
                ans.add(i+1);
            }
        }
        return ans;
        // code here
        
    }
}