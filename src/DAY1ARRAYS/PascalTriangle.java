package DAY1ARRAYS;
import java.util.*;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int aboveLeft = result.get(i - 1).get(j - 1);
                    int aboveRight = result.get(i - 1).get(j);
                    row.add(aboveLeft + aboveRight);
                }
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = generate(numRows);
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)