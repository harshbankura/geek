class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            
        stack.push(queue.remove());
            
            
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        return queue;
        // code here.
    }
}