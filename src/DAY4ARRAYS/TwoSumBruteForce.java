package DAY4ARRAYS;
import java.util.*;
public class TwoSumBruteForce {
    public static int[] TwoSum(int[] arr, int target) {
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }
}
