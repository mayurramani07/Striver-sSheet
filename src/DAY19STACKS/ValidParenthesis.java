package DAY19STACKS;
import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            }
            else if(c == '{') {
                stack.push('}');
            }
            else if(c == '[') {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();  //return true
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)


//WHY WE CHOOSE DEQUE OVER STACK?
//Using Deque instead of Stack is better because Deque is faster,
// non-synchronized, and preferred in modern Java for stack-like operations.