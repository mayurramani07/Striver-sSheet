package DAY16GREEDYALGORITHM;
import java.util.*;
public class MaxProfitInJobScheduling {
    static class Job {
        int start;
        int end;
        int profit;

        public Job(int s, int e , int p) {
            this.start=s;
            this.end=e;
            this.profit=p;
        }
    }
    public static int JobScheduling(int[] start, int[] end, int[] profit) {
        int n = start.length;

        //Create Job objects and sort by endTime
        Job[] jobs = new Job[n];
        for(int i=0 ; i<n ; i++) {
            jobs[i] = new Job(start[i],end[i],profit[i]);
        }
        Arrays.sort(jobs, Comparator.comparingInt(j -> j.end));

        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        for(int i=1 ; i<n ; i++) {
            int currProfit = jobs[i].profit;

            int last = binarySearch(jobs, i);
            if(last != -1) {
                currProfit += dp[last];
            }
            dp[i] = Math.max(dp[i-1], currProfit);
        }
        return dp[n-1];
    }
    public static int binarySearch(Job[] job , int index) {
        int start = 0;
        int end = index - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (job[mid].end <= job[index].start) {
                if (job[mid + 1].end <= job[index].start) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}