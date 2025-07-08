// User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if(st.size()==0){
            st.push(x);
            return st;
        }
        int top = st.pop();
        insertAtBottom(st,x);
        st.push(top);
        return st;
    }
}