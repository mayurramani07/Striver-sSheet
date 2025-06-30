package DAY3ARRAYS;
import java.util.*;
public class PowXn {
    public static double Powxn(double x, long n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 1 / Powxn(x , -n);
        }
        if(n % 2 == 1) {
            return x * Powxn(x * x, n / 2);
        }
        return Powxn(x * x , n/2);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        long n = 10;
        System.out.println(Powxn(x,n));
    }
}

//TIME COMPLEXITY : O(logn)
//SPACE COMPLEXITY : O(1)