package DAY26LeetcodeQuestions;
import java.util.*;
public class CountHillAndValley {
    public static int CountHillValley(int[] nums){
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1 ; i<nums.length ; i++) {
            if(nums[i] != nums[i-1]) {
                list.add(nums[i]);
            }
        }
        for(int i=1 ; i<list.size()-1 ; i++) {
            if(list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1)) {
                count++;
            }
            else if(list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1)) {
                count++;
            }
        }
        return count;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)