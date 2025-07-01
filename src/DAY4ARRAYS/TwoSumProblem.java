package DAY4ARRAYS;
import java.util.*;
public class TwoSumProblem {
    public static int[] TwoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }
}

//TIME COMPLEXITY : 0(n)
//SPACE COMPLEXITY : O(n)