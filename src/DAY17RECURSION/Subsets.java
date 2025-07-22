package DAY17RECURSION;
import java.util.*;
public class Subsets {
    public static List<List<Integer>> MakeSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int num : nums) {
            int size = result.size();
            for(int i=0 ; i<size ; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(MakeSubsets(nums));
    }
}
//TIME COMPLEXITY : O(2^n * n)
//SPACE COMPLEXITY : O(2^n * n)