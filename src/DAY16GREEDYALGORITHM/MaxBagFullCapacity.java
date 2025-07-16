package DAY16GREEDYALGORITHM;
import java.util.*;
public class MaxBagFullCapacity {
    public static int MaxBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] needed = new int[n];

        for(int i=0 ; i<n ; i++) {
            needed[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(needed);

        int count = 0;
        for(int i=0 ; i<n ; i++) {
            if(needed[i] <= additionalRocks) {
                additionalRocks -= needed[i];
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
