package DAY3ARRAYS;
import java.util.*;
public class MajorityElement {
    public static int MajorityEle(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > n/2) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(MajorityEle(arr));
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)