package DAY2ARRAYS;
import java.util.*;
public class FindMissingAndRepeatedValues {
    public static int[] FindMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] count = new int[size + 1];

        for(int[] row : grid) {
            for(int num : row) {
                count[num]++;
            }
        }
        int[] result = new int[2];

        for(int i=1 ; i<=size ; i++) {
            if(count[i] == 2) {
                result[0] = i;
            }
            if(count[i] == 0) {
                result[1] = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] grid = {{1,3}, {2,2}};
        int[] result = FindMissingAndRepeated(grid);
        System.out.println(Arrays.toString(result));
    }
}
