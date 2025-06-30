package DAY3ARRAYS;
import java.util.*;
public class MajorityElement2 {
    public static List<Integer> MajorityElement(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                list.add(key);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(MajorityElement(arr));
    }
}
