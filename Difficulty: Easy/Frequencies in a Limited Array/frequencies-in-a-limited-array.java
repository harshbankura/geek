class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=arr.length;i++){
            ans.add(map.getOrDefault(i,0));
            
        }
        return ans;
        // do modify in the given array
    }
}
