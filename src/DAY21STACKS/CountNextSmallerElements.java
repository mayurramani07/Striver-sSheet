package DAY21STACKS;
import java.util.*;
public class CountNextSmallerElements {
    public static int[] countSmallerElements(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(sorted[i], i);
            }
        }
        int[] result = new int[arr.length];
        for(int i=0 ;i<arr.length ; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}

//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(n)