package DAY4ARRAYS;
import java.util.*;
public class ReversePairs {
    public static int ReversePair(int[] arr) {
        int count = 0;
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i ; j<arr.length ; j++) {
                if(arr[i] > 2 * arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(ReversePair(arr));
    }
}
