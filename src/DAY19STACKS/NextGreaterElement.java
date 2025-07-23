package DAY19STACKS;
import java.util.*;
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1 , int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i=n-1 ; i>=0 ; i--) {
            while(!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nge[i] = -1;
            }
            else {
                nge[i] = s.peek();
            }
            s.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for(int i=0 ; i<nums1.length ; i++) {
            for(int j=0 ; j<nums2.length ; j++) {
                if(nums1[i] == nums2[i]) {
                    result[i] = nge[j];
                    break;
                }
            }
        }
        return result;
    }
}

//TIME COMPLEXITY - O(m*n)
//SPACE COMPLEXITY - O(m+n)