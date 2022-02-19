package Stack_FTPrep;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s)
    {
        Stack<Character> stack=new Stack<>();
        for (Character c:s.toCharArray())
        {
            if (c=='{'||c=='['||c=='(')
            {
                stack.push(c);
            }
            else if (c=='}'&&!stack.isEmpty()&&stack.peek()=='{')
            {
                stack.pop();
            }
            else if (c==']'&&!stack.isEmpty()&&stack.peek()=='[')
            {
                stack.pop();
            }
            else if (c==')'&&!stack.isEmpty()&&stack.peek()=='(')
            {
                stack.pop();
            }
else
            {
                return false;
            }
        }

return true;
    }
}
