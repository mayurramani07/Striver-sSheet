package DAY1ARRAYS;
import java.util.*;
public class FindTheMaxSubarray {
    public static int MaxSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0 ; i<arr.length ; i++) {
            currSum = currSum + arr[i];
            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr =  {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubarray(arr));
    }
}
