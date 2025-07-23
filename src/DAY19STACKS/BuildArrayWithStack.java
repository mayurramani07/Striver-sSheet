package DAY19STACKS;
import java.util.*;
public class BuildArrayWithStack {
    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int targetIndex = 0;

        for(int i=1 ; i<=n && targetIndex < target.length ; i++) {
            result.add("Push");

            if(target[targetIndex] == i) {
                targetIndex++;
            }
            else {
                result.add("Pop");
            }
        }
        return result;
    }
}
