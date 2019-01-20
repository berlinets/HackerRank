package diagonalDifference;

public class Solution {
    static int diagonalDifference(int[][] arr) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i][i];
            b = b + arr[i][arr.length - i - 1];

            System.out.println();
        }

//        System.out.println("sumFirst = " + a);
//        System.out.println("sumSecond = " + b);
//        System.out.println("Diff abs = " + Math.abs(a - b));
        return Math.abs(a - b);
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}

        };
        diagonalDifference(m);
    }
}