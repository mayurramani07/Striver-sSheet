package DAY20STACKS;
import java.util.*;
public class DailyTemperaturesOptimized {
    public static int[] DailyTemperature(int[] t) {
        int[] result = new int[t.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<t.length ; i++) {
            while(!stack.isEmpty() && t[stack.peek()] < t[i]) {
                int pop = stack.pop();
                result[pop] = i - pop;
            }
            stack.push(i);
        }
        return result;
    }
}
//TIME COMPLEXITY : O(n);
//SPACE COMPLEXITY : O(1);