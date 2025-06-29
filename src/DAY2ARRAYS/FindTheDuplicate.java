package DAY2ARRAYS;
import java.util.*;
public class FindTheDuplicate {
    public static int FindDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int nums : arr) {
            map.put(nums, map.getOrDefault(nums, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > 1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(FindDuplicate(arr));
    }
}
