package miniMaxSum;

import java.util.Arrays;

public class Solution {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
            max += arr[i + 1];
        }
        System.out.printf("%s %s", min, max);
    }

    public static void main(String[] args) {
        int[] ar = {1, 5, 8, 3, 9};
        miniMaxSum(ar);
    }
}
