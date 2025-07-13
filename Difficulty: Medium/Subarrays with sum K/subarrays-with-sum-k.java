class Solution {
    public int cntSubarrays(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count =0;
        int sum=0;
        map.put(0,1);
        for(int i : arr){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        return count;
        // code here
        
    }
}