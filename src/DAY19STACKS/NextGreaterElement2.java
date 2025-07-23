package DAY19STACKS;
import java.util.*;
public class NextGreaterElement2 {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();

        Arrays.fill(result, -1);

        for(int i=2*n-1 ; i>=0 ; i--) {
            int idx = i % n;

            while(!s.isEmpty() && nums[s.peek()] <= nums[idx]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                result[idx] = nums[s.peek()];
            }
            s.push(idx);
        }

        return result;
    }
}