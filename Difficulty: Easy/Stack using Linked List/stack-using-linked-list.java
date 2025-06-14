class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        StackNode nn = new StackNode(a);
        nn.next=top;
        top=nn;
        
        // Add your code here
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(top==null)return -1;
        int ans = top.data;
        top=top.next;
        return ans;
        // Add your code here
    }
}