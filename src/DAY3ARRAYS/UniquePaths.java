package DAY3ARRAYS;
import java.util.*;
public class UniquePaths {
    public static int Uniquepath(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(i == 0 || j == 0) {
                    grid[i][j] = 1;
                }
                else {
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        System.out.println(Uniquepath(m,n));
    }
}

//TIME COMPLEXITY : O(m*n)
//SPACE COMPLEXITY : O(1)