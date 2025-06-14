import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> spanList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Pop all elements from the stack while arr[stack.peek()] <= arr[i]
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // If the stack is empty, it means all previous prices are less than or equal
            if (stack.isEmpty()) {
                spanList.add(i + 1);
            } else {
                spanList.add(i - stack.peek());
            }

            // Push current index to stack
            stack.push(i);
        }

        return spanList;
    }
}
