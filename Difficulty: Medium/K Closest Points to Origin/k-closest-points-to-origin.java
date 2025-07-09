class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            int distA = a[0]*a[0]+a[1]*a[1];
            int distB = b[0]*b[0]+b[1]*b[1];
            return distB-distA;
        });
        for(int point[]:points){
            pq.add(point);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        int idx=0;
        for(int[] p :pq ){
            ans[idx++]=p;
        }
        return ans;
        // Your code here
        
    }
}