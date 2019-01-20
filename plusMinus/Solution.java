package plusMinus;

public class Solution {
    static void plusMinus(int[] arr) {
        float positive = 0;
        float negative = 0;
        float zeros = 0;

        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zeros++;
            }
        }
        System.out.printf("%.6f\n", positive/arr.length);
        System.out.printf("%.6f\n", negative/arr.length);
        System.out.printf("%.6f", zeros/arr.length);
    }

    public static void main(String[] args) {
        int[] ar = {-4, 3, -9, 0, 4, 1};
        plusMinus(ar);
    }
}
