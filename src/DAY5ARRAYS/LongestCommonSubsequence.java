package DAY5ARRAYS;
import java.util.*;
public class LongestCommonSubsequence {
    public static int LongestCommon(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int length = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(LongestCommon(arr));
    }
}