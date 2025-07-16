package DAY16GREEDYALGORITHM;
import java.util.*;
public class MaximumUnitsOnTruck{
    public static int maxUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));

        int TotalUnits = 0;
        for(int[] box : boxTypes) {
            int Count = Math.min(box[0], truckSize);
            TotalUnits += Count * box[1];
            truckSize -= Count;

            if(truckSize == 0) {
                break;
            }
        }
        return TotalUnits;
    }
}

//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(1)