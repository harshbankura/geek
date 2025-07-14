class Solution {
    public long subarrayXor(int arr[], int k) {
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: one prefix XOR of 0
        map.put(0, 1);

        for (int num : arr) {
            xor ^= num;  // current prefix XOR

            // Check if there's a prefix XOR that satisfies xor ^ prevXOR = k
            int requiredXOR = xor ^ k;
            count += map.getOrDefault(requiredXOR, 0);

            // Store current prefix XOR in map
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
        // code here
        
    }
}