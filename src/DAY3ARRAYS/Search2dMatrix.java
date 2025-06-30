package DAY3ARRAYS;
import java.util.*;
public class Search2dMatrix {
    public static boolean SearchMatrix(int[][] matrix, int target) {
        for(int i=0 ; i< matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = SearchMatrix(matrix, target);
        System.out.println(result);
    }
}

//TIME COMPLEXITY : O(m*n)
