package DAY4ARRAYS;
import java.util.*;
public class FourSum2 {
    public static List<List<Integer>> foursum(int[] arr, int target) {
        if(arr == null || arr.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0 ; i<arr.length-3 ; i++) {
            for(int j=i+1 ; j< arr.length-2 ; j++) {
                int left = j+1;
                int right = arr.length - 1;

                while(left < right) {
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                    if(sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;
                    } else if(sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> result = foursum(arr, target);
        System.out.println(result);
    }
}
