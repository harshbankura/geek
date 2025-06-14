/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty()) return s;
        int top = s.pop();
        sort(s);
        insert(s,top);
        return s;
        // add code here.
    }
    private void insert(Stack<Integer> s, int top){
        if(s.isEmpty()||top>s.peek()){
            s.push(top);
            return;
        }
        int x = s.pop();
        insert(s,top);
        s.push(x);
        return;
    }
}