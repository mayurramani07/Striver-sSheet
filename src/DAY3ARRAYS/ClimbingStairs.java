package DAY3ARRAYS;
import java.util.*;
public class ClimbingStairs {
    public static int ClimbingStair(int m) {
        if(m==1) {
            return 1;
        }
        int[] dp = new int[m+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3 ; i<=m ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[m];
    }
    public static void main(String[] args) {
        int m = 3;
        System.out.println(ClimbingStair(m));
    }
}

//TIME COMPLEXITY : O(n);
//SPACE COMPLEXITY : O(1);