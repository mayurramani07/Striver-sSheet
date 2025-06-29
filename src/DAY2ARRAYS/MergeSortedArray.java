package DAY2ARRAYS;

public class MergeSortedArray {
    public static void MergeSorted(int[] arr, int m, int[] arr2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0) {
            if(i >= 0 && arr[i] > arr2[j]) {
                arr[k--] = arr[i--];
            }
            else{
                arr[k--] = arr[j--];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;
    }
}
