package DAY15LINKEDLIST;
import java.util.*;
public class MaxConsecutiveOnes {
    public static int Maxone(int[] nums) {
        int count = 0;
        int largest = 0;

        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i] == 1) {
                count++;
                if (largest < count) {
                    largest = count;
                }
            }
            else {
                count = 0;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(Maxone(nums));
    }
}
//TIME COMPLEXITY : O(n);
//SPACE COMPLEXITY : O(1);