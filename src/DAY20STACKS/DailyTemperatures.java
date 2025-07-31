package DAY20STACKS;
import java.util.*;
public class DailyTemperatures {
    public static int[] DailyTemperature(int[] t) {
        int[] result = new int[t.length];
        for(int i=0 ; i<t.length ; i++) {
            int curr = t[i];
            for(int j=i+1 ; j<t.length ; j++) {
                if(t[j] > curr) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}

//TIME COMPLEXITY : O(n^2)
//SPACE COMPLEXITY : O(1)