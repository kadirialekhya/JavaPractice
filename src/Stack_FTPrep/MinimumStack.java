package Stack_FTPrep;

import java.util.Stack;

public class MinimumStack {
    private Stack<Integer>stack=null;
    private Stack<Integer>minStack=null;
    int min;
    public MinimumStack()
    {
        stack=new Stack<Integer>();
        minStack=new Stack<Integer>();
    }

    public void push(int val) {
        int min = val;
        if (!minStack.isEmpty()) {
            if (min > minStack.peek()) {
                min = minStack.peek();
            }
        }
        stack.push(val);
        minStack.push(min);
    }


    public void pop() {
        minStack.pop();
        stack.pop();
    }



    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}
