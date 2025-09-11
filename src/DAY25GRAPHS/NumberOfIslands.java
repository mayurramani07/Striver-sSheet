package DAY25GRAPHS;
import java.util.*;
public class NumberOfIslands {
    static class Node{
        int dest;
        int src;
        int wt;

        public Node(int d, int s, int w) {
            this.dest = d;
            this.src = s;
            this.wt = w;
        }
    }
    public static int NumOfIslads(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    dfs(grid, i , j);
                }
            }
        }
        return count;
    }
    public static void dfs(int[][] grid, int i , int j) {
        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || i>=m || j < 0 || j>=n || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = '0';

        dfs(grid,i+1, j);
        dfs(grid, i-i, j);
        dfs(grid, i, j+1);
        dfs(grid, i , j-1);
    }
}

//Time complexity : O(m*n)
//Space Complexity : O(m*n)