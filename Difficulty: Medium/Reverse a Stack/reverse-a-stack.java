// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) return ;
        int top=s.pop();
        reverse(s);
        addB(s,top);
        return;
        // add your code here
    }
    private static void addB(Stack<Integer> s , int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int x = s.pop();
        addB(s,top);
        s.push(x);
        return;
        
    }
}