class Solution {
    public static int largest(int[] arr) {
        // code here
        int max=arr[0];
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}
