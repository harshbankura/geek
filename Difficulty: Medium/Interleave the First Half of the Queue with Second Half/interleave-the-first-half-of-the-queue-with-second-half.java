class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        int size=q.size();
        Queue<Integer> half = new LinkedList<>();
        for(int i=0;i<size/2;i++){
            half.offer(q.poll());
           
            
        }
        while(!half.isEmpty()){
            q.offer(half.poll());
            q.offer(q.poll());
        }
        return q;
        // code here
        
    }
}
