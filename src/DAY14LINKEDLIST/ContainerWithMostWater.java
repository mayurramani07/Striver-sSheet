package DAY14LINKEDLIST;
import java.util.*;
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
//TIME COMPLEXITY : O(n);
//SPACE COMPLEXITY : O(1);