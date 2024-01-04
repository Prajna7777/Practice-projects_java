package LongestIncreasingSubsequence;

public class LIS {
    public static int findLisValue(int[] arr) {
        int n = arr.length;
        int lisArray[] = new int[n];

        for (int i = 0; i < n; i++) {
            lisArray[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lisArray[i] < lisArray[j] + 1) {
                	lisArray[i] = lisArray[j] + 1;
                }
            }
        }

        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            if (lisArray[i] > maxLIS) {
                maxLIS = lisArray[i];
            }
        }
        return maxLIS;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,2,9,40,30,50};
        int lisLength = findLisValue(arr);
        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }
}