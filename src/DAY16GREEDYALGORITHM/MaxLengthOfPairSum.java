package DAY16GREEDYALGORITHM;
import java.util.*;
public class MaxLengthOfPairSum {
    public static int MaxLength(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> Integer.compare(a[1], b[1]));

        int currEnd = Integer.MIN_VALUE;
        int count = 0;

        for(int[] pair : pairs) {
            if(pair[0] > currEnd) {
                count++;
                currEnd = pair[1];
            }
        }
        return count;
    }
}
