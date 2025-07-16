package DAY16GREEDYALGORITHM;
import java.util.*;
public class JumpGame {
    public static boolean JumpGamee(int[] nums) {
        int finalPosition = nums.length - 1;

        for(int i=nums.length - 2 ; i>=0 ; i--) {
            if(i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return finalPosition == 0;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)